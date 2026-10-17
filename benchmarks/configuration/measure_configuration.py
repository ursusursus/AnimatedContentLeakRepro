#!/usr/bin/env python3
"""Measure only Gradle project configuration on three navigation branches.

Run from an unmodified checkout. Creates three detached worktrees at fixed
revisions, outside the checkout. Requires Python 3 and a working Gradle environment.
"""
import argparse
import csv
from datetime import datetime, timezone
from html import unescape
import itertools
import json
import os
from pathlib import Path
import platform
import re
import statistics
import shutil
import subprocess

BRANCHES = {
    'control': 'experiment/navigation-500-control',
    'shared-contract': 'experiment/navigation-500-shared-contract',
    'per-feature-contract': 'experiment/navigation-500-per-feature-contract',
}
FLAGS = ['help', '--dry-run', '--no-configuration-cache',
         '--no-configure-on-demand', '--no-parallel', '--max-workers=2',
         '--offline', '--profile', '--console=plain']

def command(repo, *args):
    return subprocess.check_output(args, cwd=repo, text=True).strip()

def duration_ms(value):
    units = {'ms': 1, 's': 1000, 'm': 60000, 'h': 3600000}
    matches = re.findall(r'([\d.]+)(ms|s|m|h)', value)
    if not matches:
        raise ValueError(f'Unrecognized duration: {value}')
    return round(sum(float(n) * units[unit] for n, unit in matches), 3)

def table_rows(html):
    return {unescape(label.strip()): duration_ms(value.strip())
            for label, value in re.findall(
                r'<td>([^<]+)</td>\s*<td class="numeric">([^<]+)</td>', html)}

def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--repo', type=Path, default=Path.cwd())
    parser.add_argument('--output', type=Path, required=True)
    parser.add_argument('--warmups', type=int, default=6)
    parser.add_argument('--samples', type=int, default=12)
    args = parser.parse_args()
    repo, output = args.repo.resolve(), args.output.resolve()
    if output == repo or repo in output.parents:
        parser.error('--output must be outside the checkout (worktrees are created)')
    if args.warmups < 1 or args.samples < 1:
        parser.error('Need at least one warmup and sample')
    if command(repo, 'git', 'status', '--porcelain'):
        parser.error('Checkout must be clean before measuring')
    output.mkdir(parents=True, exist_ok=True)
    if (output / 'samples.csv').exists():
        parser.error('Output already contains samples.csv; use a new directory')
    raw = output / 'raw'
    raw.mkdir(exist_ok=True)
    revisions = {name: command(repo, 'git', 'rev-parse', branch)
                 for name, branch in BRANCHES.items()}
    metadata = {
        'started_utc': datetime.now(timezone.utc).isoformat(),
        'revisions': revisions, 'branches': BRANCHES, 'command': ['./gradlew', *FLAGS],
        'warmups_per_layout': args.warmups, 'samples_per_layout': args.samples,
        'platform': platform.platform(), 'logical_cpus': os.cpu_count(),
        'cpu_affinity_count': len(os.sched_getaffinity(0)),
        'gradle_version_output': command(repo, str(repo / 'gradlew'), '--version'),
    }
    cpuinfo = Path('/proc/cpuinfo')
    if cpuinfo.exists():
        metadata['cpu_model'] = next((line.split(':', 1)[1].strip()
                                     for line in cpuinfo.read_text().splitlines()
                                     if line.startswith('model name')), 'unknown')
    for name in ('cpu.max', 'memory.max'):
        path = Path('/sys/fs/cgroup') / name
        if path.exists():
            metadata['cgroup_' + name.replace('.', '_')] = path.read_text().strip()
    (output / 'metadata.json').write_text(json.dumps(metadata, indent=2) + '\n')
    worktrees = {}
    for name, revision in revisions.items():
        worktree = output / 'worktrees' / name
        subprocess.run(['git', 'worktree', 'add', '--detach', str(worktree), revision],
                       cwd=repo, check=True, stdout=subprocess.DEVNULL)
        worktrees[name] = worktree
    permutations = list(itertools.permutations(BRANCHES))
    rows = []
    for phase, rounds in [('warmup', args.warmups), ('measured', args.samples)]:
        for iteration in range(rounds):
            order = permutations[iteration % len(permutations)]
            for position, name in enumerate(order):
                worktree = worktrees[name]
                assert command(worktree, 'git', 'rev-parse', 'HEAD') == revisions[name]
                label = f'{phase}-{iteration:02d}-{position}-{name}'
                run = subprocess.run([str(worktree / 'gradlew'), *FLAGS], cwd=worktree,
                                     text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
                (raw / f'{label}.log').write_text(run.stdout)
                if run.returncode:
                    raise RuntimeError(f'Build failed: {label}; see raw log')
                match = re.search(r'See the profiling report at: file://(/[^\r\n]+\.html)', run.stdout)
                if not match:
                    raise RuntimeError(f'Missing profile: {label}')
                report = Path(match.group(1))
                html = report.read_text()
                for asset in ('css', 'js'):
                    if not (raw / asset).exists():
                        shutil.copytree(report.parent / asset, raw / asset)
                (raw / f'{label}.html').write_text(html)
                metrics = table_rows(html)
                if metrics['Task Execution'] != 0:
                    raise RuntimeError(f'Task execution detected: {label}')
                # Snapshot all phases separately; configuration is the comparison metric.
                row = dict(phase=phase, iteration=iteration, position=position,
                           layout=name, commit=revisions[name],
                           configuration_ms=metrics['Configuring Projects'],
                           settings_buildsrc_ms=metrics['Settings and buildSrc'],
                           loading_projects_ms=metrics['Loading Projects'],
                           task_execution_ms=metrics['Task Execution'])
                rows.append(row)
                print(f"{label}: configuration={row['configuration_ms']:.0f} ms; execution=0 ms", flush=True)
                # Persist incrementally so interrupted runs retain their samples.
                with (output / 'samples.csv').open('w', newline='') as f:
                    writer = csv.DictWriter(f, fieldnames=list(row))
                    writer.writeheader()
                    writer.writerows(rows)
    summary = {}
    for name in BRANCHES:
        values = [r['configuration_ms'] for r in rows if r['phase'] == 'measured' and r['layout'] == name]
        quartiles = statistics.quantiles(values, n=4, method='inclusive') if len(values) > 1 else values * 3
        summary[name] = dict(samples=len(values), median_ms=statistics.median(values),
                             min_ms=min(values), max_ms=max(values), q1_ms=quartiles[0],
                             q3_ms=quartiles[2], mean_ms=statistics.mean(values),
                             stdev_ms=statistics.stdev(values) if len(values) > 1 else 0)
    for name in BRANCHES:
        base = summary['control']['median_ms']
        summary[name]['delta_vs_control_ms'] = summary[name]['median_ms'] - base
        summary[name]['delta_vs_control_percent'] = (summary[name]['median_ms'] / base - 1) * 100
    (output / 'summary.json').write_text(json.dumps(summary, indent=2) + '\n')
    print(json.dumps(summary, indent=2), flush=True)

if __name__ == '__main__':
    main()

# Gradle project configuration benchmark

Measured on 2026-10-16, using the three independently buildable navigation
experiment branches. This measures **Gradle's “Configuring Projects” duration**,
not total build time. No task actions were executed.

| Layout | Contract modules | Gradle projects¹ | Median | Middle 50% (Q1–Q3) | Min–max | Median increase over control |
| --- | ---: | ---: | ---: | ---: | ---: | ---: |
| Control: keys inside feature implementations | 0 | 203 | 671.5 ms | 628–775 ms | 552–1044 ms | — |
| One shared contract | 1 | 205 | 697.5 ms | 645.8–772 ms | 508–1338 ms | +26 ms (+3.9%) |
| Per-feature contracts | 100 | 303 | 1288 ms | 1212.3–1462 ms | 965–1919 ms | +616.5 ms (+91.8%) |

¹ Counts include the root, app, and intermediate projects created by nested
Gradle paths. All layouts contain 100 Android feature implementation modules.

Per-feature contracts added **590.5 ms (+84.7%) over the shared contract** by
median. The shared/control difference is small relative to the observed
variability; this run does not establish a meaningful difference between them.
Per-feature contracts have a visible configuration cost here, but the absolute
increase is about 0.6 seconds. Whether that is acceptable is a development
workflow decision, alongside the ownership and dependency isolation benefits.

## Method

- Gradle 9.8.1, AGP 9.4.1, Kotlin 2.4.21; JDK 25.0.4.1, Linux.
- AMD EPYC 9V74 host; 3 logical CPUs available; Gradle limited to 2 workers.
  Full runtime information and exact measured commit SHAs are in metadata.json.
- Three fixed, detached Git worktrees. Build files were stable throughout the
  measured run. No branch checkout occurred between samples.
- Shared Gradle user home and a warm Gradle daemon; cached plugins and compiled
  build scripts. Six warmup invocations per layout were discarded, followed by
  twelve measured invocations per layout.
- Each round ran all three layouts sequentially. All six order permutations
  were used once for warmups and twice for measurements, balancing position.
- Configuration cache, configuration on demand, and parallel configuration were
  disabled. Offline mode excluded dependency downloads. Configuration still
  ran on every invocation.
- Parsed “Configuring Projects” from the official Gradle `--profile` HTML report.
  Settings/buildSrc and project loading are recorded separately in samples.csv.
  Startup, task graph creation, task execution, and total build time are excluded
  from the primary metric. Project configuration was sequential.
- `help --dry-run` selected a minimal task graph and skipped task actions. Every
  one of the 54 retained profiles (18 warmups + 36 measured runs) reports
  **Task Execution = 0 seconds**. None of these runs compiled application code.
- All twelve measured samples per layout were retained, including slow samples.
  Quartiles use Python statistics.quantiles with the inclusive method.

The original app and generated NavKey/route sources are unchanged by this
benchmark. These are synthetic, minimal modules. This is a warm-cache project
configuration comparison, not a cold install, IDE sync, configuration-cache-hit,
full build, or task graph/dependency resolution benchmark. Applying more plugins
or heavier convention logic can change the cost per contract module.

An initial branch-switching trial was stopped after observing extra overhead
when checkout rewrote build files. Its samples are excluded. Only the subsequent
complete fixed-worktree run is reported and archived here.

## Reproduce

From a clean checkout, configure the Android SDK and JDK as for the validation
build. Have the wrapper and plugin dependencies cached, since this uses offline
mode. Fetch all three experiment branches as local branches if needed.

```sh
python3 benchmarks/configuration/measure_configuration.py \
  --repo "$PWD" \
  --output /tmp/navigation-config-new-run \
  --warmups 6 --samples 12
```

Use a fresh output directory outside the checkout. The script creates three
fixed worktrees there and leaves them available for inspection. It records the
current commit for each local experiment branch before measuring.

Each measurement runs this command in the selected worktree:

```sh
./gradlew help --dry-run --no-configuration-cache \
  --no-configure-on-demand --no-parallel --max-workers=2 \
  --offline --profile --console=plain
```

## Files

- `samples.csv`: individual warmup and measured phase durations.
- `summary.json`: aggregate project configuration statistics in milliseconds.
- `metadata.json`: exact measured commits, command, and environment.
- `raw-profiles.tar.gz`: all 54 HTML profiles, their console logs, and HTML assets.
  Extract with `tar -xzf raw-profiles.tar.gz` and open a report under `raw/`.
- `measure_configuration.py`: runner and parser, using Python's standard library.

# 500-feature Gradle project configuration benchmark

Measured on 2026-10-17 using three new branches derived from the 600-feature
branches. Each contains 500 Android feature implementation modules, one
serializable key per feature and an acyclic 499-edge cross-feature navigation
chain. Features 501–600 (and their contracts/keys) were removed and feature500
became the terminal feature. Earlier branches and results are unchanged.

The metric is Gradle's **Configuring Projects** duration. It excludes execution
and is not total build time. Every retained profile reports zero task execution.

| Layout | Contracts | Gradle projects¹ | Median | Middle 50% (Q1–Q3) | Min–max |
| --- | ---: | ---: | ---: | ---: | ---: |
| control | 0 | 1003 | 9.8810 s | 7.9815–10.1490 s | 3.726–10.611 s |
| shared-contract | 1 | 1005 | 8.6315 s | 5.2060–9.4605 s | 3.420–11.159 s |
| per-feature-contract | 500 | 1503 | 14.0050 s | 11.3385–17.3898 s | 7.996–18.677 s |

¹ Counts include the root, app and intermediate parent projects.

Per-feature contracts added **5.374 s (+62.3%) over shared**.
Dividing by 499 additional modules gives **10.77 ms per additional contract**,
on average. Against control, the increase was **4.124 s (+41.7%)**, or
**8.25 ms per contract** on average. Shared was 1.250 s (−12.6%) below control.
These are differences of layout medians, not isolated timings of individual modules.

## Comparison with the earlier runs

| Layout | 100 features | 200 features | 500 features | 600 features |
| --- | ---: | ---: | ---: | ---: |
| control | 0.6715 s | 1.3160 s | 9.8810 s | 9.2375 s |
| shared-contract | 0.6975 s | 1.1575 s | 8.6315 s | 8.6615 s |
| per-feature-contract | 1.2880 s | 2.3145 s | 14.0050 s | 15.2155 s |

The 500-feature medians are close to the 600-feature ones, not proportionally
lower: control was slightly higher, shared about equal and per-feature 1.2 s
lower. Both runs sit well above a linear extrapolation of the 100/200 results,
so the jump happened somewhere between 200 and 500 features at a 2 GiB heap.
The per-contract cost (10.77 ms vs shared) is close to the 600 run's 10.94 ms.

**This run used different hardware from the 600 run** (see below), so the 500
and 600 columns are not a controlled comparison. The test did not isolate GC,
script classloading or other causes of the increase.

### Invocation position effect

Within each round the first layout run was consistently fastest. Medians by
position within the round (0 = first):

| Layout | Position 0 | Position 1 | Position 2 |
| --- | ---: | ---: | ---: |
| control | 5.079 s | 10.458 s | 9.954 s |
| shared-contract | 4.685 s | 7.225 s | 9.315 s |
| per-feature-contract | 9.415 s | 14.005 s | 18.208 s |

Each layout ran in each position four times, so the comparison above stays
balanced, but this effect explains most of the wide spread. It is consistent
with daemon heap pressure building across consecutive builds of different
roots, though this was not verified.

## Benchmark method (same as previous runs)

```sh
./gradlew help --dry-run --no-configuration-cache \
  --no-configure-on-demand --no-parallel --max-workers=2 \
  --offline --profile --console=plain
```

- Three fixed detached worktrees, pinned to the exact source commits in
  metadata.json. No branch checkout or source rewrite occurred between samples.
- Six warmup invocations per layout were excluded. Twelve measured invocations
  per layout followed; all measured samples were retained.
- Each round ran all three layouts sequentially. All six order permutations
  were used once for warmups and twice for measurements, balancing invocation position.
- Shared Gradle user home, cached plugins/compiled build scripts and a warmed
  Gradle daemon. Configuration cache, configuration on demand and parallel
  configuration were disabled. Offline mode prevented dependency downloads.
- **Gradle heap remained 2 GiB**. The 4 GiB validation daemons were stopped
  first. The only daemon start was in the first warmup; there were no measured
  daemon restarts or out-of-heap errors in any invocation.
- Parsed **Configuring Projects** from the official HTML profile. Settings/buildSrc
  and project loading times are stored separately in CSV.
- **Task Execution = 0 seconds in all 54 retained profiles**: 18 warmups and
  36 measured invocations.
- Gradle 9.8.1, AGP 9.4.1, Kotlin 2.4.21, daemon JDK Eclipse Adoptium 25.0.3
  (toolchain auto-provisioned), Android platform 37.0.
  Intel Xeon @ 2.80GHz, 4 logical CPUs, 15 GiB memory, no cgroup CPU/memory
  limits detected, Gradle limited to 2 workers. (The 600 run used an AMD EPYC
  9V74, 3 logical CPUs, a 2-vCPU quota, an 8 GiB memory limit and JDK 25.0.4.1.)
- Quartiles use Python statistics.quantiles with the inclusive method.

These synthetic minimal modules do not measure cold dependency installation,
IDE sync, configuration-cache hits, full builds or assembleDebug's additional
task/dependency setup.

## Separate compilation validation

All three 500-feature layouts passed full app assembly using the same command
as the 600-feature validation:

```sh
./gradlew :app:assembleDebug --console=plain --max-workers=2 \
  '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' \
  '-Pkotlin.daemon.jvmargs=-Xmx1024m'
```

| Layout | Result |
| --- | --- |
| control | BUILD SUCCESSFUL in 4m 57s |
| shared-contract | BUILD SUCCESSFUL in 3m 7s |
| per-feature-contract | BUILD SUCCESSFUL in 4m 13s |

The heap overrides were carried over from the 600 run; a full build at the
checked-in 2 GiB heap was not attempted. Durations include a partially warm
dependency cache and are not configuration results.

Maven Central returned repeated HTTP 429 (rate-limited) responses in this
environment, so the initial control builds failed during dependency download.
The successful validation builds added Google's Maven Central mirror through an
untracked init script (`-I mirror.init.gradle`, included in the logs archive).
No source or build script was changed; the benchmark itself ran `--offline`
without the init script.

## New branches

- experiment/navigation-500-control
- experiment/navigation-500-shared-contract
- experiment/navigation-500-per-feature-contract

## Reproduce configuration measurements

From a clean checkout, configure the JDK/Android SDK, cache wrapper and plugin
dependencies, and ensure all three 500-feature branches exist locally. Then run:

```sh
python3 benchmarks/configuration/measure_configuration.py \
  --repo "$PWD" \
  --output /tmp/navigation-500-config-new-run \
  --warmups 6 --samples 12
```

Use a fresh output directory outside the checkout. The checked-in Gradle
properties select the 2 GiB benchmark heap; do not add validation's heap
overrides to timing runs.

## Evidence

- samples.csv: all warmup and measured samples with separate phase durations.
- summary.json: aggregate configuration statistics in milliseconds.
- metadata.json: source commits, command, environment and benchmark audit.
- raw-profiles.tar.gz: all 54 HTML profiles, console logs and HTML assets.
- validation-logs.tar.gz: passed full builds, the failed rate-limited attempts
  and the mirror init script.
- baseline-100/200/600-summary.json: earlier statistics.
- measure_configuration.py: reproducible runner/parser using Python's standard library.

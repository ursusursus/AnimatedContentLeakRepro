# 600-feature Gradle project configuration benchmark

Measured on 2026-10-16 using three new independently runnable branches. Each
contains 600 Android feature implementation modules, one serializable key per
feature and an acyclic 599-edge cross-feature navigation chain. The existing
100- and 200-feature branches and results are unchanged.

The metric is Gradle's **Configuring Projects** duration. It excludes execution
and is not total build time. Every retained profile reports zero task execution.

| Layout | Contracts | Gradle projects¹ | Median | Middle 50% (Q1–Q3) | Min–max |
| --- | ---: | ---: | ---: | ---: | ---: |
| control | 0 | 1203 | 9.2375 s | 6.7382–9.7105 s | 3.929–10.660 s |
| shared-contract | 1 | 1205 | 8.6615 s | 8.1270–9.1005 s | 3.333–9.682 s |
| per-feature-contract | 600 | 1803 | 15.2155 s | 11.8902–17.4240 s | 10.788–20.365 s |

¹ Counts include the root, app and intermediate parent projects.

Per-feature contracts added **6.554 s (+75.7%) over shared**.
Dividing by 599 additional modules gives **10.94 ms per additional contract**,
on average. Against control, the increase was
**5.978 s (+64.7%)**, or
**9.96 ms per contract** on average.
These are differences of layout medians, not isolated timings of individual modules.

## Comparison with the earlier runs

| Layout | 100 features | 200 features | 600 features |
| --- | ---: | ---: | ---: |
| control | 0.6715 s | 1.3160 s | 9.2375 s |
| shared-contract | 0.6975 s | 1.1575 s | 8.6615 s |
| per-feature-contract | 1.2880 s | 2.3145 s | 15.2155 s |

All three layouts became much slower at 600 features under the 2 GiB Gradle
heap. The earlier approximately 6 ms per additional contract estimate does not
scale linearly to this case. The 600-feature run also has substantial spread,
which is shown above; none of its measured samples were discarded.
The test did not isolate GC, script classloading or other causes of the increase.

These are separate sessions on the same managed environment using the same
configuration measurement protocol. They are not paired 100/200/600 samples.
Earlier summaries are preserved here for reference; full original evidence
remains on the original 100- and 200-feature experiment branches.

The control applies serialization to Android implementations containing keys;
the contract layouts apply it to the key-containing JVM modules. The measurement
compares the full layouts, including their plugin placement, not empty-project cost.

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
- **Gradle heap remained 2 GiB**, matching the earlier runs. The validation
  daemons were stopped first. There were no measured daemon restarts or
  out-of-heap warnings in any measured invocation.
- Parsed **Configuring Projects** from the official HTML profile. Settings/buildSrc
  and project loading times are stored separately in CSV. Startup, task graph
  creation, task execution and total build duration are excluded from the primary
  metric. Project configuration was sequential.
- **Task Execution = 0 seconds in all 54 retained profiles**: 18 warmups and
  36 measured invocations. No application compilation happened in the benchmark.
- Gradle 9.8.1, AGP 9.4.1, Kotlin 2.4.21, JDK 25.0.4.1, SDK 37.
  AMD EPYC 9V74 host, 3 logical CPUs in the affinity mask, 2-vCPU cgroup quota,
  8 GiB memory quota, and Gradle limited to 2 workers.
- Quartiles use Python statistics.quantiles with the inclusive method.

These timings describe this alternating-worktree protocol. Gradle can reuse
script classloaders differently across build roots, and consecutive builds in
one checkout can be faster. The reported spread includes that variability;
invocation-position balancing does not remove every possible cache-order effect.
These synthetic minimal modules do not measure cold dependency installation,
IDE sync, configuration-cache hits, full builds or assembleDebug's additional
task/dependency setup. More convention plugins or other hardware can change costs.

## Separate compilation validation and heap limit

The initial full per-feature build failed with **Java heap space at 2 GiB**.
All three 600-feature layouts then passed full app assembly using:

```sh
./gradlew :app:assembleDebug --console=plain --max-workers=2 \
  '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' \
  '-Pkotlin.daemon.jvmargs=-Xmx1024m'
```

The 4 GiB Gradle and 1 GiB compiler heaps were validation-only overrides. The
checked-in Gradle heap stayed at 2 GiB and no heap override was passed to the
benchmark. The full-build failure is not a failed configuration-only sample.
Validation logs, including the initial failure, are in validation-logs.tar.gz.

## New branches

- experiment/navigation-600-control
- experiment/navigation-600-shared-contract
- experiment/navigation-600-per-feature-contract

## Reproduce configuration measurements

From a clean checkout, configure the JDK/Android SDK, cache wrapper and plugin
dependencies, and ensure all three 600-feature branches exist locally. Then run:

```sh
python3 benchmarks/configuration/measure_configuration.py \
  --repo "$PWD" \
  --output /tmp/navigation-600-config-new-run \
  --warmups 6 --samples 12
```

Use a fresh output directory outside the checkout. The script records the
current branch commits, creates fixed detached worktrees there and leaves them
available for inspection. The checked-in Gradle properties select the 2 GiB
benchmark heap; do not add validation's heap overrides to timing runs.

## Evidence

- samples.csv: all warmup and measured samples with separate phase durations.
- summary.json: aggregate configuration statistics in milliseconds.
- metadata.json: source commits, command, environment and benchmark audit.
- raw-profiles.tar.gz: all 54 HTML profiles, console logs and HTML assets.
  Extract with `tar -xzf raw-profiles.tar.gz` and open a report under raw/.
- validation-logs.tar.gz: passed full builds, initial heap failure and validation command.
- baseline-100-summary.json / baseline-200-summary.json: earlier statistics.
- measure_configuration.py: reproducible runner/parser using Python's standard library.

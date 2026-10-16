# Navigation contract experiment: per-feature

This branch contains 600 Android feature implementation modules. The existing
app depends on all 600, while preserving its original UI. Each feature has one
serializable Navigation 3 key, an ownRoute function, and (except feature600) a
nextRoute function referencing the following feature's key.

Layout: **per-feature**. Keys keep identical packages and contents across branches.
The control stores keys in implementation modules; shared uses one Kotlin/JVM
contract module; per-feature uses 600 Kotlin/JVM contract modules. Contracts use
Kotlin JVM and serialization plugins, with no java-library plugin. All build and
settings scripts use Groovy. Android modules use AGP's built-in Kotlin support.

The dependency chain feature001 -> feature002 -> ... -> feature600 is acyclic
so the control can compile. It has 599 cross-feature edges in every layout.
The control deliberately exposes implementation modules to consumers; the other
layouts expose contracts. This difference is intrinsic to the comparison.
Gradle also creates intermediate parent projects for the nested paths; counts
of actual projects therefore exceed counts of modules with build scripts.

Branches:
- experiment/navigation-600-control: 600 feature modules, no contract modules
- experiment/navigation-600-shared-contract: 600 features + 1 shared contract
- experiment/navigation-600-per-feature-contract: 600 features + 600 contracts

## Validation

All three 600-feature layouts passed full app assembly using:

```sh
./gradlew :app:assembleDebug --console=plain --max-workers=2 \
  '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' \
  '-Pkotlin.daemon.jvmargs=-Xmx1024m'
```

The initial full per-feature-contract build failed with Java heap space at the
original 2 GiB Gradle heap. The validated command uses a 4 GiB Gradle heap and a
1 GiB Kotlin compiler heap. These are compilation-validation overrides only.
The checked-in Gradle heap remains 2 GiB for the configuration benchmark,
matching the earlier 100- and 200-feature tests. A separate configuration-only
pilot succeeded at 2 GiB. Validation durations are not configuration results.

Use an AGP-compatible JDK and Android SDK 37. Java and Kotlin target JVM 17.
Configuration-only measurements are recorded in benchmarks/configuration.

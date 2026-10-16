# Navigation contract experiment: per-feature

This branch contains 100 Android feature implementation modules. The existing
app depends on all 100, while preserving its original UI. Each feature has one
serializable Navigation 3 key, an ownRoute function, and (except feature100) a
nextRoute function referencing the following feature's key.

Layout: **per-feature**. Keys keep identical packages and contents across branches.
The control stores keys in implementation modules; shared uses one Kotlin/JVM
contract module; per-feature uses 100 Kotlin/JVM contract modules. Contracts use
Kotlin JVM and serialization plugins, with no java-library plugin. All build and
settings scripts use Groovy. Android modules use AGP's built-in Kotlin support.

The dependency chain feature001 -> feature002 -> ... -> feature100 is acyclic
so the control can compile. It has 99 cross-feature edges in every layout.
The control deliberately exposes implementation modules to consumers; the other
layouts expose contracts. This difference is intrinsic to the comparison.
Gradle also creates intermediate parent projects for the nested paths; counts
of actual projects therefore exceed counts of modules with build scripts.

Branches:
- experiment/navigation-control: 100 feature modules, no contract modules
- experiment/navigation-shared-contract: 100 features + 1 shared contract
- experiment/navigation-per-feature-contract: 100 features + 100 contracts

## Validation (not benchmarks)

Use JDK 17+ compatible with the wrapper/AGP and install Android SDK 37.
The Kotlin toolchain requests JDK 17; have it installed locally or configure
Gradle toolchain discovery. Configure your SDK using ANDROID_HOME or
local.properties, and use the checked-in wrapper.

```sh
./gradlew projects
./gradlew :app:assembleDebug
```

No timing runs have been performed. Do not interpret validation build duration
as a configuration benchmark. A later benchmark should warm dependencies and
script caches, alternate branch order, measure repeated configuration without
configuration cache, and separately measure configuration-cache reuse.

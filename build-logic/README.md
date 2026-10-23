The main build resolves the convention plugin from Maven Local instead of
including this build. Publish it once before running the main build:

```bash
./gradlew -p build-logic publishToMavenLocal
```

This publishes the plugin JAR and plugin marker to `~/.m2/repository` by default.
Normal main-build invocations do not configure or compile this project.

After changing the plugin, increment `version` in `build.gradle`, publish again,
and update the plugin version in the main `settings.gradle`.

The plugin depends on AGP and Kotlin using the shared version catalog. Keep the
explicit AGP and Kotlin plugin versions in the main `settings.gradle` aligned
with that catalog; these requests let Gradle verify the versions already supplied
by the convention plugin.

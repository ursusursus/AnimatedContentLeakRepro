package com.example.buildlogic

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class LibraryConventionsPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
            project.extensions.configure("java") { java ->
                java.sourceCompatibility = JavaVersion.VERSION_17
                java.targetCompatibility = JavaVersion.VERSION_17
            }

            project.extensions.configure("kotlin") { kotlin ->
                kotlin.compilerOptions.jvmTarget = "JVM_17"
            }
        }

        project.pluginManager.withPlugin("com.android.library") {
            project.extensions.configure("android") { android ->
                android.compileSdk = 37
                android.defaultConfig.minSdk = 24
                android.compileOptions.sourceCompatibility = JavaVersion.VERSION_17
                android.compileOptions.targetCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}

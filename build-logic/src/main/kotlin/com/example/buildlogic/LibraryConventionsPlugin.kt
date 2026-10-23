package com.example.buildlogic

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class LibraryConventionsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
            project.extensions.getByType(JavaPluginExtension::class.java).apply {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }

            project.extensions.configure(KotlinJvmProjectExtension::class.java) { kotlin ->
                kotlin.compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }

        project.pluginManager.withPlugin("com.android.library") {
            project.extensions.configure(LibraryExtension::class.java) { android ->
                android.compileSdk = 37
                android.defaultConfig.minSdk = 24
                android.compileOptions.sourceCompatibility = JavaVersion.VERSION_17
                android.compileOptions.targetCompatibility = JavaVersion.VERSION_17
            }

            project.extensions.configure(KotlinAndroidProjectExtension::class.java) { kotlin ->
                kotlin.compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
            }
        }
    }
}

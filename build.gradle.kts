// Top-level build file
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.devtools.ksp") version "2.0.20-1.0.25" apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
    id(Dependency.Hilt.HILT_PLUGIN) version Versions.HILT apply false
    alias(libs.plugins.compose.compiler) apply false
}
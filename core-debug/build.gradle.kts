@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvmToolchain(21)

    compilerOptions {
        freeCompilerArgs.add("-XXLanguage:+ExplicitBackingFields")
    }

    jvm()

    // No DOM here; node runs the (future) wasm tests without a browser.
    wasmJs {
        nodejs()
    }

    sourceSets {
        commonMain.dependencies {
            api(project(":core"))
            api(project(":core-dsl"))
        }
    }
}

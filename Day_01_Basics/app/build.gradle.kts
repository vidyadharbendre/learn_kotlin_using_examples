plugins {
    id("com.android.application") version "8.1.0"
    kotlin("android") version "1.9.0"
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.day01_basics" // Change this for each day
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    // Add other dependencies as needed
}
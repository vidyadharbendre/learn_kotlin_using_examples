plugins {
    id("com.android.application") version "8.1.0"
    kotlin("android") version "1.9.0"
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.day15_viewmodel_livedata"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    testImplementation(kotlin("test"))
}
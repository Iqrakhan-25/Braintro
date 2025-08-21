plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.braintro"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.braintro"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.13.1")
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("com.google.android.material:material:1.12.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    implementation ("androidx.activity:activity-ktx:1.9.2")
    implementation ("androidx.fragment:fragment-ktx:1.8.2")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation(libs.androidx.activity)
    implementation ("com.airbnb.android:lottie:6.1.0")
    implementation ("com.google.firebase:firebase-dynamic-links-ktx:21.1.0")

}
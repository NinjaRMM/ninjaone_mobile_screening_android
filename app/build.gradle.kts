plugins {
    id("com.android.application")
    kotlin("android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(AppConfig.compileSdk)

    defaultConfig {
        applicationId = "com.example.zeldaapp"
        minSdkVersion(AppConfig.minSdk)
        targetSdkVersion(AppConfig.targetSdk)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.customInstrumentedRunner
    }

    buildTypes {
        getByName(AppConfig.release) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(AppConfig.proguardOptimize),
                AppConfig.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        android.buildFeatures.viewBinding = true
        android.buildFeatures.dataBinding = true
        android.buildFeatures.compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }

}

dependencies {
    implementation(project(":commons"))
    implementation(project(":network"))
    implementation(project(":ui"))

    implementation(AppDependencies.coreLibraries)
    implementation(AppDependencies.koinLibraries)
    implementation(AppDependencies.lifecycleLibraries)
    implementation(AppDependencies.navigationLibraries)
    implementation(AppDependencies.uiLibraries)

    implementation(AppDependencies.retrofit)
    implementation(AppDependencies.gson)
    implementation(AppDependencies.cardView)

    implementation(AppDependencies.composeActivity)
    implementation(AppDependencies.composeMaterial)
    implementation(AppDependencies.constraintMaterial)
    implementation(AppDependencies.material3)
    implementation(AppDependencies.viewModelKtx)
    implementation(AppDependencies.viewModelCompose)

    debugImplementation(AppDependencies.fragmentTesting)

    testImplementation(AppDependencies.unitTestLibraries)

    androidTestImplementation(AppDependencies.androidTestLibraries)
}
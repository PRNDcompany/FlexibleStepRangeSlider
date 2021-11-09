plugins {
    id("com.android.library")
    kotlin("android")
    id("com.vanniktech.maven.publish")
}

group = rootProject.properties["GROUP"]!!
version = rootProject.properties["VERSION_NAME"]!!

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 16
        targetSdk = 31
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.Material.material)
}

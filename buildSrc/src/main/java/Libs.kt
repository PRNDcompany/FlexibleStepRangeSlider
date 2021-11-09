object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.2"
    const val mavenPublishPlugin = "com.vanniktech:gradle-maven-publish-plugin:0.18.0"

    object Kotlin {
        private const val version = "1.5.31"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${version}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.6.0"
        const val appCompat = "androidx.appcompat:appcompat:1.3.1"
    }

    object Material {
        const val material = "com.google.android.material:material:1.4.0"
    }
}

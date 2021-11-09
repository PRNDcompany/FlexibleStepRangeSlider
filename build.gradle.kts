buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.Kotlin.gradlePlugin)
        classpath(Libs.mavenPublishPlugin)
    }
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}

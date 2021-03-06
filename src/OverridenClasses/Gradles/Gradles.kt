package OverridenClasses.Gradles

import OverridenClasses.projectName
import java.io.File

fun createBuildProjectLevel () {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\build.gradle").delete()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\build.gradle").writeText("""
    // Top-level build file where you can add configuration options common to all sub-projects/modules.
    buildscript {
        repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
        }
        dependencies {
            classpath "com.android.tools.build:gradle:7.0.3"
            classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31"
            classpath 'gradle.plugin.com.onesignal:onesignal-gradle-plugin:0.13.4'


            // NOTE: Do not place your application dependencies here; they belong
            // in the individual module build.gradle files
        }
    }

    task clean(type: Delete) {
        delete rootProject.buildDir
    }
""".trimIndent())
}

fun createBuildAppLevel ()  {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\build.gradle").delete()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\build.gradle").writeText("""
    plugins {
        id 'com.android.application'
        id 'kotlin-android'
        id 'com.onesignal.androidsdk.onesignal-gradle-plugin'
    }
    android {
        compileSdk 31

        defaultConfig {
            applicationId "com.olo.nanie.pocasa.com"
            minSdk 21
            targetSdk 31
            versionCode 1
            versionName "1.0"

            testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        }


        buildFeatures {
            viewBinding true
        }


        buildTypes {
            release {
                minifyEnabled true
                shrinkResources true
                proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
            }
        }
        compileOptions {
            sourceCompatibility JavaVersion.VERSION_1_8
            targetCompatibility JavaVersion.VERSION_1_8
        }
        kotlinOptions {
            jvmTarget = '1.8'
        }
    }

    dependencies {

        implementation 'androidx.core:core-ktx:1.7.0'
        implementation 'androidx.appcompat:appcompat:1.3.1'
        implementation 'com.google.android.material:material:1.4.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.2'
        testImplementation 'junit:junit:'
        androidTestImplementation 'androidx.test.ext:junit:1.1.3'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
        implementation 'com.airbnb.android:lottie:4.2.0'
        implementation 'com.onesignal:OneSignal:4.6.0'
        implementation("androidx.activity:activity-ktx:1.4.0")
        implementation 'io.insert-koin:koin-core:3.1.3'
        implementation 'io.insert-koin:koin-android:3.1.3'
        implementation 'io.insert-koin:koin-androidx-navigation:3.1.3'
        implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
        implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
    }
""".trimIndent())
}



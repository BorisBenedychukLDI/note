package OverridenClasses

import java.io.File

fun createXMLFile ()  {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\AndroidManifest.xml").delete()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\AndroidManifest.xml").writeText("""
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="$packageName">

    <uses-permission android:name="android.permission.INTERNET"/>

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:name=".Application56huk"
        android:usesCleartextTraffic="true"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Design.NoActionBar"
        tools:targetApi="m">
        <activity
            android:name=".MainActivity56huk"
            android:configChanges="fontScale|keyboard|keyboardHidden|locale|navigation|orientation|screenLayout|screenSize|smallestScreenSize|uiMode|touchscreen"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

    """.trimIndent())
}
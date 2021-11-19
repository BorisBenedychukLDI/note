package OverridenClasses.XmlClasses.navigation

import OverridenClasses.packageName
import OverridenClasses.projectName
import java.io.File

fun createNavigationFile () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\navigation\\nav_56huk.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <navigation xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/nav_56huk"
        app:startDestination="@id/firstFragment56huk">

        <fragment
            android:id="@+id/firstFragment56huk"
            android:name="$packageName.FirstFragment56huk"
            android:label="FirstFragment56huk" >
            <action
                android:id="@+id/action_firstFragment56huk_to_secondFragment56huk"
                app:destination="@id/secondFragment56huk"
                app:popUpTo="@id/firstFragment56huk"
                app:popUpToInclusive="true"
                app:exitAnim="@anim/exit_56huk"
                app:popExitAnim="@anim/exit_56huk"
                app:enterAnim="@anim/enter_56huk"
                app:popEnterAnim="@anim/enter_56huk"/>
        </fragment>
        <fragment
            android:id="@+id/secondFragment56huk"
            android:name="$packageName.SecondFragment56huk"
            android:label="SecondFragment56huk" />
    </navigation>
""".trimIndent())
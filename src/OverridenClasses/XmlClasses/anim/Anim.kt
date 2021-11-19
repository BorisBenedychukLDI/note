package OverridenClasses.XmlClasses.anim

import OverridenClasses.projectName
import java.io.File

fun createExitAnimation() = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\anim\\exit_56huk.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
     <alpha android:fromAlpha="0" android:toAlpha="1" android:duration = "600"/>
    </set>
""".trimIndent())

fun createEnterAnimation () = File ("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\anim\\enter_56huk.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
        <alpha android:fromAlpha="1" android:toAlpha="0" android:duration = "600"/>

    </set>
""".trimIndent())




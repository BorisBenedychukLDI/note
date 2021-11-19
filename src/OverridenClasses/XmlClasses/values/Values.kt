package OverridenClasses.XmlClasses.values

import OverridenClasses.projectName
import java.io.File

fun createColors () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\values\\colors.xml").apply {
    delete()
    writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <color name="purple_200">#FFBB86FC</color>
        <color name="purple_500">#FF6200EE</color>
        <color name="purple_700">#FF3700B3</color>
        <color name="teal_200">#FF03DAC5</color>
        <color name="teal_700">#FF018786</color>
        <color name="black">#FF000000</color>
        <color name="white">#FFFFFFFF</color>
        <color name="theme_1_56huk">#4d7299</color>
        <color name="theme_2_56huk">#0c386d</color>
        <color name="theme_3_56huk">#fd8f00</color>
    </resources>
""".trimIndent())
}


fun createStrings () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\values\\strings.xml").apply {
    delete()
    writeText("""
    <resources>
        <string name="app_name">Online Pokies</string>
        <string name="logo_56huk">OP</string>
        <string name="start_56huk">Start</string>
        <string name="connection_56huk">Looking for connection...</string>
    </resources>
""".trimIndent())
}
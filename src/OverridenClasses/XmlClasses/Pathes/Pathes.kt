package OverridenClasses.XmlClasses.Pathes

import OverridenClasses.editPackageName
import OverridenClasses.projectName
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths

fun createDirectories () {

    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\KoinPack56huk").mkdir()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\anim").mkdir()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\navigation").mkdir()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\xml").mkdir()

}
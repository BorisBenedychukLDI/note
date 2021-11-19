package OverridenClasses

import OverridenClasses.Gradles.createBuildAppLevel
import OverridenClasses.Gradles.createBuildProjectLevel
import OverridenClasses.XmlClasses.anim.createEnterAnimation
import OverridenClasses.XmlClasses.anim.createExitAnimation
import OverridenClasses.XmlClasses.layout.createActivity
import OverridenClasses.XmlClasses.layout.createFirstFr
import OverridenClasses.XmlClasses.layout.createSecondFr
import OverridenClasses.XmlClasses.navigation.createNavigationFile
import OverridenClasses.XmlClasses.values.createColors
import OverridenClasses.XmlClasses.values.createStrings
import OverridenClasses.XmlClasses.xml.createXmlScene1
import OverridenClasses.XmlClasses.xml.createXmlScene2

const val packageName = "com.example.com.myapplication"
const val projectName = "MyApplication3"


fun editPackageName ()  = packageName.replace(".", "\\", true)

fun createKotlinClasses () {
    createFileDeps()
    createFileKoin()
    createApplication()
    createSecondFragment()
    createMainActivityClass()
    createFirstFragmentClass()
    createViewModelClass()
}


fun createXmlFiles () {
    createExitAnimation()
    createEnterAnimation()
    createActivity()
    createSecondFr()
    createFirstFr()
    createNavigationFile()
    createColors()
    createStrings()
    createXmlScene1()
    createXmlScene2()
}

fun createGradleFiles () {
    createBuildProjectLevel()
    createBuildAppLevel()
}
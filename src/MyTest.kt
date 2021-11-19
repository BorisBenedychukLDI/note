import OverridenClasses.XmlClasses.Pathes.createDirectories
import OverridenClasses.createGradleFiles
import OverridenClasses.createKotlinClasses
import OverridenClasses.createXMLFile
import OverridenClasses.createXmlFiles

fun main () {
    createDirectories()
    createXMLFile()
    createKotlinClasses()
    createXmlFiles()
    createGradleFiles()
}


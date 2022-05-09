import java.io.BufferedReader
import java.io.File

fun main(args: Array<String>) {
    val fileName = args[0]
    val currentPath = System.getenv("CURRENT_DIRECTORY")
    val buff: BufferedReader = File("$currentPath/$fileName").bufferedReader()
    val list: List<String> = buff.readLines()


    var previousDepth: Int = 0
    var increaseCount = 0
    for (depthString in list) {
        var depth: Int = depthString.toInt()
        if (previousDepth == 0) {
            previousDepth = depth
            continue
        }
        if (previousDepth < depth) increaseCount++
//        if (previousDepth > depth) if
        previousDepth = depth
    }
    println(increaseCount)
}
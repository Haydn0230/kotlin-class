package AdventOfCode.Utils

import java.io.BufferedReader
import java.io.File

fun ReadFile(fileName: String):List<String> {
    val currentPath = System.getenv("CURRENT_DIRECTORY")
    val buff: BufferedReader = File("$currentPath/$fileName").bufferedReader()
    return buff.readLines()
}
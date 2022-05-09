import java.io.BufferedReader
import java.io.File

fun main(args: Array<String>) {
    val fileName = args[0]
    val currentPath = System.getenv("CURRENT_DIRECTORY")
    val buff: BufferedReader = File("$currentPath/$fileName").bufferedReader()
    val list: List<String> = buff.readLines()


    var firstWindow: ArrayList<Int> = arrayListOf()
    var secondWindow: ArrayList<Int> = arrayListOf()

    var increaseCount = 0

    for (depthString in list) {
        var depth: Int = depthString.toInt()

        if (firstWindow.size >= 1) secondWindow.add(depth)

        firstWindow.add(depth)

        if (secondWindow.size < 3) continue

        var fl = firstWindow.subList(firstWindow.size - 4, firstWindow.size - 1)
        var sl = secondWindow.subList(secondWindow.size - 3, secondWindow.size)

        var firstSum: Int = firstWindow.subList(firstWindow.size - 4, firstWindow.size - 1).sum()

        var secondSum: Int = secondWindow.subList(secondWindow.size - 3, secondWindow.size).sum()


        if (firstSum < secondSum) increaseCount++
    }
    println(increaseCount)
}
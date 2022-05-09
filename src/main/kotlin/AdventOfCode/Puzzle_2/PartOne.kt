package AdventOfCode.Puzzle_2

import AdventOfCode.Utils.ReadFile

fun main(args:Array<String>) {
    val data: List<String> = ReadFile(args[0])
    var horizontal: Int = 0
    var depth: Int = 0
    for (item in data) {
        var splitItem: List<String> = item.split(" ")
        var direction :String = splitItem[0]
        var distance :Int = splitItem[1].toInt()
        when (direction) {
            "forward" -> horizontal += distance
            "down" -> depth += distance
            "up" -> depth -= distance
            else -> println("didn't recognise the direction from $item")
        }
    }
    val result = horizontal * depth
    println("result $result")
}
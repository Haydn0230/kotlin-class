package AdventOfCode.Puzzle_3
import AdventOfCode.Utils.ReadFile
fun main(args: Array<String>) {
    val data = ReadFile(args[0])
    var orderedData: Array<Array<Int>> = arrayOf(arrayOf())
    for ((rowIndex, row) in data.withIndex()) {
        val splitString = row.trim().split("")
        for ((index, bit) in splitString.withIndex()) {
            if (bit == "") continue
            if (orderedData.size < index) orderedData.
            orderedData.set(bit.toInt())
        }
    }
    println(orderedData)
}
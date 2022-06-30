package lessons

fun main(args:Array<String>) {

    println("Please choose a product\n 1 - coke\n 2-lilt \n 3-fanta")
    val numberRead = readLine()
    var selection: Int?
    try {
        selection = numberRead?.toInt()
        println("How many would you like?")
        val numberOfCansOption = readLine()
        var numberOfCans: Int?
        try {
            numberOfCans = numberOfCansOption!!.toInt()

            when (selection) {
                1 -> println( "price ${numberOfCans * 90}p")
                2 -> println( "price ${numberOfCans * 30}p")
                3 -> println( "price ${numberOfCans * 50}p")
            }
        } catch (e: Exception) {
            println("an exception happened \n${e.localizedMessage}")
        }
    } catch (e: Exception) {
        println("an exception happened \n${e.localizedMessage}")
    }



}

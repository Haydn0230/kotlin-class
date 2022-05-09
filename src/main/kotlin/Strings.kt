fun main(args: Array<String>) {
    val l: List<String> = listOf("tiger", "dog", "birds")
    println(l)

    val l2: ArrayList<String> = arrayListOf<String>("tiger",  "dog", "birds")
    println(l2)
    l2.remove("birds")
    println(l2)
    l2.add("bullfinch")
    println(l2)

    l2.addAll(arrayListOf("alpacha", "flamingo", "rhino"))
    println(l2)
    l2.removeAll(arrayListOf("tiger",  "dog", "birds"))
    println(l2)
}
package techSymposium

fun main() {
    val listOf = listOf("one", "two", "three")
    val sortedBy = listOf.sortedWith { v1, v2 ->
        if (v1.length > v2.length)
            0
        else
            1
    }
    println(listOf)
    println(sortedBy)
}
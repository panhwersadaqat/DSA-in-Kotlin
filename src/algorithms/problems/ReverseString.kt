package algorithms.problems

fun main() {
    val string = "My name is Sadaqat"
    println(reverseString(string))
}

private fun reverseString(value: String): String {
    var reversedString = ""

    for(i in value.length-1 downTo 0) {
        reversedString += value[i]
    }

    return reversedString
}
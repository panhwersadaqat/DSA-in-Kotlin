package datastructures.array

fun main() {
    var num = 10
    val twoD = Array(4) { IntArray(3) }

    for(i in twoD) {
        for(j in i) {
            print(j)
            print(" ")
        }
        println("")
    }

}
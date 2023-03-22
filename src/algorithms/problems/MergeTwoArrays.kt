package algorithms.problems

fun main() {
    val array1 = arrayOf(0,3,4,31)
    val array2 = arrayOf(4,6,30)

    mergeArrays(array1, array2)
}

private fun mergeArrays(array1: Array<Int>, array2: Array<Int>) {
    var tempArray = ArrayList<Int>()

    for(i in 0 .. array1.size-1) {
        tempArray += array1[i]
    }

    for(j in 0 .. array2.size-1) {
        tempArray += array2[j]
    }

    tempArray.sort()

    println(tempArray)
}
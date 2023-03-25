package algorithms.problems

fun main() {
    val array1 = arrayOf(0,3,4,31)
    val array2 = arrayOf(4,6,30)

    mergeArrays(array1, array2)
}

private fun mergeArrays(array1: Array<Int>, array2: Array<Int>) {
    var tempArray = ArrayList<Int>()

    for(element in array1) {
        tempArray += element
    }

    for(element in array2) {
        tempArray += element
    }

    tempArray.sort()

    println(tempArray)
}

package algorithms.sorting


fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    var left = list.subList(0,middle);
    var right = list.subList(middle,list.size);

    return merge(mergeSort(left), mergeSort(right))
}
fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList;
}

fun main() {
    val numbers = arrayListOf(6,4,5,3,2,1)
    val sortedList = mergeSort(numbers)
    println("Before sort: $numbers")
    println("After sort: $sortedList")
}
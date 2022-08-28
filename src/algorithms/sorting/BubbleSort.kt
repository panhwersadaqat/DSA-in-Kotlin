package algorithms.sorting

fun main() {
    val list = arrayListOf(6,4,5,3,2,1)
    println("Before sort: $list")
    bubbleSort(list)
    println("After sort: $list")
}

fun bubbleSort(numbers: ArrayList<Int>) {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - 1)) {
            // This is a single step
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
}
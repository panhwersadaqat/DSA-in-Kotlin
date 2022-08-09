fun recursiveBinarySearch(data: List<Int>, start: Int, end: Int, target: Int): Int {

    if (end >= start && start <= data.size-1) {

        val mid = start + (end - start) / 2

        if (data[mid] == target)
            return mid
        
        if (data[mid] > target)
            return recursiveBinarySearch(data, start, mid-1, target)

        return recursiveBinarySearch(data, mid+1, end, target)

    }

    return -1
}


fun verifyRecursiveSearch(index: Int) {
    if(index != -1)
        print("Target found at: $index")
    else
        print("Target not found!")
}

fun main() {
    val list = listOf(1,2,3,4,5,6,7,8,9)
    val result = recursiveBinarySearch(list,0,list.size-1,6)
    verifyRecursiveSearch(result)
}

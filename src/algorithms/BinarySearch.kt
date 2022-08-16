fun binarySearch(data: List<Int>, target: Int): Int {

    var first = 0
    var last = data.size-1

    while (first <= target) {
        var mid = (first+last)/2
        if(data[mid] == target)
            return mid
        else if(data[mid] < target)
            first = mid+1
        else
            last = mid-1
    }

    return -1
}

fun verifyBinarySearch(index: Int) {
    if(index != -1)
        print("Target found at: $index")
    else
        print("Target not found!")
}

fun main() {
    var list = listOf(1,2,3,4,5,6,7,8,9)
    var result = binarySearch(list,2)
    verifyBinarySearch(result)
}
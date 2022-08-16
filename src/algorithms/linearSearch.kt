fun linearSearch(data: List<Int>, key: Int): Int {
    for(index in data.indices) {
        if(data[index] == key) {
            return index
        }
    }
    return -1
}

fun verify(index: Int) {
    if(index != -1)
        print("Target found at: $index")
    else
        print("Target not found!")
}

fun main() {
    var list = listOf(1,2,3,4,5,6,7,8,9)
    var result = linearSearch(list, 3)
    verify(result)
}
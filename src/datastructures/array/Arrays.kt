package datastructures.array

fun main() {
    insertExample()
    appendExample()
    deleteExample()
    lookUpExample()
}

/**
    -Time Complexity: Linear runtime -> O(n)
    -It move elements to right for adding new element on desire index.
 */
private fun insertExample() {
    val list = arrayListOf<Int>(2,4,6,10)

    list.add(3,8)

    println(list)
}

/**
    -Time Complexity: Constant runtime O(1)
    - It can be O(n) in dynamic array because when you add
      extra element in array, it copy all the items from one array
      to new array by looping all through the first array.
    -It does not move elements index for adding,
     it just add new value at the end of list.
*/
private fun appendExample() {
    val list = arrayListOf<Int>(2,4,6,8)

    list += 10

    println(list)
}

/**
    -Time Complexity: Linear runtime O(n)
    -It move elements to left for removing element on desire index.
*/
private fun deleteExample() {
    val list = arrayListOf<Int>(2,4,6,8,10,12)

    list.remove(12)

    println(list)
}

/**
    -Time Complexity: Constant runtime => O(1)
 */
private fun lookUpExample() {
    val list = arrayOf<Int>(2,4,6,8,10,12)
    println(list[2])
}
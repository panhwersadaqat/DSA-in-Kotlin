package datastructures

fun main() {
    insertExample()
    appendExample()
    deleteExample()
}

private fun insertExample() {
    val list = arrayListOf<Int>(2,4,6,10)

        /*
            -Linear runtime
            -It move elements to right for adding new element on desire index.
        */

    list.add(3,8)

    println(list)
}

private fun appendExample() {
    val list = arrayListOf<Int>(2,4,6,8)

      /*
          -Constant runtime
           -It does not move elements index for adding , it just add new value at the end of list.
     */

    list += 10

    println(list)
}

private fun deleteExample() {
    val list = arrayListOf<Int>(2,4,6,8,10,12)

        /*
            -Linear runtime
            -It move elements to left for removing element on desire index.
        */

    list.remove(12)

    println(list)


}
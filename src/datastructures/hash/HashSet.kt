package datastructures.hash

fun main() {

    //creating hashset
    val set = hashSetOf<Int>()

    //adding elements to hashset
    set.add(1)
    set.add(2)
    set.add(3)
    set.add(4)
    set.add(5)
    set.add(2)
    set.add(3)

    //print hashset
    println(set)

    //check if hashset contains the value
    if(set.contains(1)) {
        println("hash contains 1")
    }

    // remove hash element
    set.remove(5)

    println(set)

    if(!set.contains(5)) {
        println("hash does not contains 5 - because we removed it")
    }

    //iterating hash elements
    val it = set.iterator()

    while (it.hasNext()) {
        println(it.next())
    }

}
package algorithms.sorting

fun main() {
    val list = arrayListOf(6,4,5,3,2,1)
    println("Before sort: $list")
    val sortedList =  quicksort(list)
    println("After sort: $sortedList")
}
fun quicksort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val i = items[items.count()/2]

    val equal = items.filter { it == i }

    val less = items.filter { it < i }

    val greater = items.filter { it > i }

    return quicksort(less) + equal + quicksort(greater)
}
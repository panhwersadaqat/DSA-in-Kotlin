package algorithms.sorting

fun main() {
    val list = arrayListOf(6,4,5,3,2,1)
    println("Before sort: $list")
    val ordered =  quicksort(list)
    println("After sort: $ordered")
}
fun quicksort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]

    val equal = items.filter { it == pivot }
//    println("pivot value is : "+equal)

    val less = items.filter { it < pivot }
//    println("Lesser values than pivot : "+less)

    val greater = items.filter { it > pivot }
//    println("Greater values than pivot : "+greater)

    return quicksort(less) + equal + quicksort(greater)
}
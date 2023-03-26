package datastructures.hashtables
import java.util.*

fun main() {
    val fruitHashMap = hashMapOf<String, Int>()

    //inserting elemtns in hashmap
    fruitHashMap["Apple"] = 1
    fruitHashMap["Banana"] = 2
    fruitHashMap["Orange"] = 3
    fruitHashMap["Bread"] = 4

    // print hashmap
    println(fruitHashMap)

    // remove element from hashmap
    fruitHashMap.remove("Bread")
    println("----Hash Map after removing Bread----")
    println(fruitHashMap)

    // check if a key is present in the HashMap
    val containsKeyApple = fruitHashMap.containsKey("Apple")
    println("Contains key 'apple': $containsKeyApple")
    val containsKeyBread = fruitHashMap.containsKey("Apple")
    println("Contains key 'Bread': $containsKeyBread")

    // check if a value is present in HashMap
    val containsValue = fruitHashMap.containsValue(1)
    println("Contains value '1': $containsValue")

    println("----Hash Map values----")
    for(values in fruitHashMap) {
        println("${values.key} = ${values.value}")
    }

}

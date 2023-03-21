package datastructures.linkedList

import java.util.LinkedList

fun main() {

    //Creating a LinkedList
    val planets = LinkedList<String>()
    planets.addAll(listOf("Earth", "Mars", "Venus"))
    println("Planets: $planets")

    //Getting first element
    println("First element: ${planets.first}")

    //Getting last element
    println("Last element: ${planets.last}")

}


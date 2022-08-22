package datastructures.linkedList

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size: Int = 0

    fun isLinkedListEmpty() : Boolean {
        return size == 0
    }

    override fun toString(): String {
        return  if(isLinkedListEmpty()) {
            "Linked List is empty!"
        }else {
             head.toString()
        }
    }

    fun pushElement(value: T) {
        head = Node(value, nextNode = head)
        if(tail == null) {
            tail = head
        }
        size+=1
    }

    fun appendElement(value: T) {

        if(isLinkedListEmpty()) {
            pushElement(value)
            return
        }

        tail?.nextNode = Node(value)
        tail = tail?.nextNode
        size+=1
    }

    fun findNodeAt(givenIndex: Int) : Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex<givenIndex) {
            currentNode = currentNode.nextNode
            currentIndex+=1
        }

        return currentNode
    }

    fun insertElement(value: T,afterNode: Node<T>) {
        if(afterNode == tail) {
            appendElement(value)
            return
        }

        val node = Node(value, nextNode = afterNode.nextNode)
        afterNode.nextNode = node
        size+=1
    }


}

fun main() {

    val linkedListWithPush = LinkedList<Int>()
    val linkedListWithAppend = LinkedList<Int>()
    val linkedListWithInsert = LinkedList<Int>()

    for (i in 1..10) {
        linkedListWithPush.apply {
            pushElement(i)
        }

       linkedListWithAppend.apply {
           appendElement(i)
       }

        linkedListWithInsert.apply {
            appendElement(i)
        }
    }

    val afterNodeRef = linkedListWithInsert.findNodeAt(givenIndex = 0)

    /*if(afterNodeRef != null) {
        linkedListWithAppend.insertElement(value = 99, afterNode = afterNodeRef)
    }*/

    afterNodeRef?.also {
        linkedListWithInsert.insertElement(value = 99, it)
    }




    println("Push output: $linkedListWithPush")
    println("Append output: $linkedListWithAppend")
    println("Insert output: $linkedListWithInsert")
}
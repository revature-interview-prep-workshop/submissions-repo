package stack

import linkedlist.LinkedListNode

class StackImpl<T> {
    var top: LinkedListNode<T>? = null
    var size = 0

    fun push(element: T) {
        val newNode = LinkedListNode(element)
        newNode.next = top
        top = newNode
        size++
    }

    fun pop(): T? {
        var ret: T? = null
        if (top != null) {
            ret = top?.value
            top = top?.next
            size--
        }
        return ret
    }

    fun peek() = top?.value

    fun isEmpty(): Boolean {
        return (size == 0)
    }

    override fun toString(): String {
        val ret = StringBuilder()
        var temp = top;
        do {
            ret.append("${temp?.value}, ")
            temp = temp?.next
        } while (temp != null)
        return ret.toString()
    }

}
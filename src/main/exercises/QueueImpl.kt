class QueueImpl<T> {
    var head: DoubleNode<T>? = null
    var tail: DoubleNode<T>? = null
    var size = 0

    fun add(element: T) {
        val newNode = DoubleNode(element)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
        size++
    }

    fun peek(): T? = head?.value

    fun poll(): T? {
        val ret = head?.value
        head = head?.next
        size--
        return ret
    }

    override fun toString(): String {
        val ret = StringBuilder()
        while (head != null) {
            ret.append("${head?.value}, ")
            head = head?.next
        }
        return ret.toString()
    }

}
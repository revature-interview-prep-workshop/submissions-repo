class LinkedListImpl<T>() {
    var head: DoubleNode<T>? = null
    var size = 0

    constructor(init: DoubleNode<T>): this() {
        this.head = init
        size++
    }

    fun add(element: T, index: Int = size) {
        // do nothing in these cases
        if (index > size || index < 0) {
            return
        }

        // edge cases
        val newNode = DoubleNode<T>(element)

        // index 0
        if (index == 0) {
            this.head?.prev = newNode
            newNode.next = head
            head = newNode
            size++
            return
        }
        // first element
        if (size == 0) {
            head = newNode
            size++
            return
        }

        // core logic
        var temp = head
        for (i in 0 until index-1) {
            temp = temp?.next
        }
        newNode.prev = temp
        newNode.next = temp?.next
        temp?.next = newNode
        size ++
    }

    fun addLast(element: T) {
        add(element, size)
    }

    fun addFirst(element: T) {
        add(element, 0)
    }

    fun remove(element: T): Boolean {
        var temp = head
        do {
            if (temp?.value == element) {
                // is head
                if (temp == head) {
                    head = head?.next
                    head?.prev = null
                } else {
                    temp?.prev?.next = temp?.next
                    temp?.next?.prev = temp?.prev
                }
                size--
                return true
            }
            temp = temp?.next
        } while (temp?.next != null)
        return false
    }

    fun contains(element: T): Boolean {
        if (head == null) {
            return false
        }

        var temp = head
        while (temp != null) {
            if (temp.value == element) {
                return true
            }
            temp = temp.next
        }
        return false
    }

    fun get(index: Int): T? {
        // fringe cases so we don't have to iterate
        if (index < 0 || index > size-1) {
            return null
        }

        var temp = head
        var i = 0
        while (i < index) {
            temp = temp?.next
            i++
        }
        return temp?.value
    }

    override fun toString(): String {
        var temp = head
        val ret = StringBuilder()

        while (temp != null) {
            ret.append("${temp?.value}, ")
            temp = temp?.next
        }

        return ret.toString()
    }

    fun clear() {
        head = null
        size = 0
    }

}
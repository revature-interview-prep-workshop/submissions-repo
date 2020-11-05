import java.util.*

class BSTImpl<T:Comparable<T>>() {

    var root:DoubleNode<T>? = null

    fun insert(element: T) {
        val newNode = DoubleNode(element)
        insertNode(newNode)
    }

    fun insertNode(newNode: DoubleNode<T>) {
        if (root != null) {
            var temp = root

            var nodeList = LinkedList<DoubleNode<T>>()
            nodeList.push(temp)

            while (nodeList.isNotEmpty()) {
                temp = nodeList.pop()

                if (newNode.value <= temp!!.value) {
                    // check left
                    if (temp.prev == null) {
                        temp.prev = newNode
                        return
                    } else {
                        nodeList.push(temp.prev)
                    }
                } else {
                    // check right
                    if (temp.next == null) {
                        temp.next = newNode
                        return
                    } else {
                        nodeList.push(temp.next)
                    }
                }
            }
        } else {
            root = newNode
        }
    }

    fun contains(element: T): Boolean {
        val st = Stack<DoubleNode<T>>()

        st.push(root)

        while(st.isNotEmpty()) {
            var temp = st.pop();
            println(temp.value)
            if (temp.value == element) {
                return true;
            }
            if (temp.next != null) {
                st.push(temp.next);
            }
            if (temp.prev != null) {
                st.push(temp.prev);
            }
        }
        return false;
    }

    fun remove(element: T) {
        val st = Stack<DoubleNode<T>>()
        st.push(root)
        var parent = root // init parent

        while (st.isNotEmpty()) {
            val temp = st.pop()

            if (temp.value == element) {
                // remove
                if (temp.prev == null && temp.next == null) {
                    // no child -> just remove node
                    updateParent(parent!!,temp)
                } else if ((temp.prev != null).xor(temp.next !=null)) {
                    // single child -> swap
                    val repl = temp.prev ?: temp.next
                    updateParent(parent!!, temp, repl)
                } else {
                    // two children
                    // find greatest child node in left branch
                    // set value of temp to greatest child node
                    // recursive remove child node

                    // init
                    var greatest = getGreatestValue(temp.prev!!)
                    remove(greatest)
                    temp.value = greatest
                }
            } else if (element < temp.value) {
                //left
                st.push(temp.prev)
            } else {
                //right
                st.push(temp.next)
            }
            parent = temp
        }
    }

    private fun updateParent(parent:DoubleNode<T>, child:DoubleNode<T>, replacement:DoubleNode<T>? = null) {
        if (parent.prev == child) {
            parent.prev = replacement
        } else {
            parent.next = replacement
        }
    }

    private fun getGreatestValue(node: DoubleNode<T>): T {
        var init = node.value
        while (node.next != null) {
            init = node.next!!.value
        }
        return init
    }

    fun size(): Int {
        var size = 0
        if (root != null) {
            val st = Stack<DoubleNode<T>>()
            st.push(root)

            while(st.isNotEmpty()) {
                val temp = st.pop()
                temp.next?.let { st.push(temp.next) }
                temp.prev?.let { st.push(temp.prev) }
                size++
            }
        }
        return size
    }

    override fun toString(): String {
        var ret = StringBuilder()

        val list = LinkedList<DoubleNode<T>>()
        list.push(root)
        ret.append("${root?.value}\n")

        while (list.isNotEmpty()) {
            var temp = list.pop()

            if (temp.prev != null) {
                ret.append("${temp.prev?.value},")
                list.add(temp.prev!!)
            }
            if (temp.next != null) {
                ret.append("${temp.next?.value},")
                list.add(temp.next!!)
            }

            ret.append("\n")
        }

        return ret.toString()
    }

}
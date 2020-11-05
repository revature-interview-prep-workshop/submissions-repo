import org.testng.annotations.BeforeMethod

import org.testng.Assert.*
import org.testng.annotations.Test

class BSTImplTest {

    private var tree1 = BSTImpl<Int>()
    private val initVals = mutableListOf(5,3,1,2,-1,8,12)

    private val five = DoubleNode(5)
    private val three = DoubleNode(3)
    private val one = DoubleNode(1)
    private val two = DoubleNode(2)
    private val nOne = DoubleNode(-1)
    private val eight = DoubleNode(8)
    private val twelve = DoubleNode(12)

    /**
     *          5
     *       /    \
     *      2      8
     *     / \      \
     *    1   3      12
     *   /
     * -1
     */

    @BeforeMethod
    fun setUp() {
        five.prev = two
        five.next = eight

        two.prev = one
        two.next = three

        one.prev = nOne
        eight.next = twelve
        tree1.root = five
    }

    @Test(enabled=false)
    fun checkPrint() {
        println(tree1)
    }

    @Test
    fun testContains() {
        for (i in initVals) {
            assertTrue(tree1.contains(i))
        }
        assertFalse(tree1.contains(-10))
    }

    @Test
    fun testSize() {
        assertEquals(tree1.size(), 7)
        val sizeTestBST = BSTImpl<String>()
        assertEquals(sizeTestBST.size(),0)
        sizeTestBST.insert("a")
        assertEquals(sizeTestBST.size(),1)
    }

    @Test
    fun testInsert() {
        val newNode = DoubleNode(4)
        tree1.insertNode(newNode)
        assertEquals(three.next, newNode)

        tree1.insert(6)
        assertEquals(eight.prev?.value, 6)
    }

    @Test
    fun testDeleteEnd() {
        tree1.remove(-1)
        assertFalse(tree1.contains(-1))
        assertTrue(one.prev == null)
        tree1.remove(3)
        assertTrue(two.next == null)
    }

    @Test
    fun testDeleteSingle() {
        tree1.remove(1)
        assertEquals(two.prev,nOne)
        tree1.remove(8)
        assertEquals(five.next,twelve)

        assertEquals(tree1.size(),initVals.size-2)
    }

    @Test
    fun testDeleteDouble() {
        tree1.remove(2)
        // testing variable names won't match value with this implementation

        val left = tree1.root?.prev
        assertTrue(left?.value == 1)
        assertEquals(left?.prev, nOne)
        assertEquals(left?.next,three)

        assertEquals(tree1.size(),6)
    }
}
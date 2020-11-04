import StackImpl
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

import org.testng.Assert.*
import org.testng.annotations.Test

class StackImplTest {

    private var stack: StackImpl<Int> = StackImpl()

    @BeforeMethod
    fun setUp() {
        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4123)
        stack.push(-11)
    }

    @AfterMethod
    fun tearDown() {
        stack = StackImpl()
    }

    @Test
    fun sanityChecks() {
        println(stack)
        assertEquals(stack.size,5)

        val stack2 = StackImpl<Int>()
        assertEquals(stack2.size, 0)
    }

    @Test
    fun testSize() {
        var i = 0
        var currentNode = stack.top
        while (currentNode != null) {
            currentNode = currentNode.next
            i++
        }
        assertEquals(stack.size,i)
    }

    @Test
    fun testPush() {
        stack.push(0)
        assertEquals(stack.size,6)
        assertEquals(stack.top?.value, 0)

        val stack2 = StackImpl<Int>()
        stack2.push(123)
        assertEquals(stack2.size, 1)
    }

    @Test
    fun testPeek() {
        assertEquals(stack.peek(),-11)
        assertNull(StackImpl<Int>().peek())
    }

    @Test
    fun testPop() {
        var initSize = stack.size
        assertEquals(stack.pop(), -11)
        assertEquals(stack.size, --initSize)

        assertEquals(stack.pop(), 4123)
        assertEquals(stack.size, --initSize)

        assertEquals(stack.pop(), 3)
        assertEquals(stack.size, --initSize)

        assertEquals(stack.pop(), 2)
        assertEquals(stack.size, --initSize)

        assertEquals(stack.pop(), 1)
        assertEquals(stack.size, 0)

        assertNull(stack.pop())
        assertEquals(stack.size, 0)
    }
}
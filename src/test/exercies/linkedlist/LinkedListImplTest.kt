package linkedlist

import org.testng.Assert.*
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

class LinkedListImplTest {

    private val list = LinkedListImpl<Int>()

    @org.testng.annotations.BeforeMethod
    fun setUp() {
        list.add(3)
        list.add(5)
        list.add(6)
        list.add(123)
        list.add(-123)
    }

    @AfterMethod
    fun tearDown() {
        list.clear()
    }

    @Test
    fun sanityChecks() {
        println(list)
        assertEquals(list.size, 5)
    }

    @Test
    fun testGet() {
        assertEquals(list.get(0), 3)
        assertEquals(list.get(3), 123)
    }

    @Test
    fun testGetInvalid() {
        assertNull(list.get(-1))
        assertNull(list.get(99999))
    }

    @Test(dependsOnMethods = ["testGet"])
    fun testAdd() {
        var size = list.size

        list.addFirst(10)
        assertEquals(list.get(0),10)
        assertEquals(list.size, ++size)

        list.addLast(545)
        assertEquals(list.get(size), 545) // at this point size = list.size-1
        assertEquals(list.size, ++size)
    }

    @Test(dependsOnMethods = ["testAdd", "testGet"])
    fun testAddIndex() {
        var init = list.get(0)
        list.add(0,0)
        assertEquals(list.get(0),0)
        assertEquals(list.get(1), init)

        init = list.get(4)
        list.add(-99,4)
        assertEquals(list.get(4),-99)
        assertEquals(list.get(5), init)
    }

    @Test(dependsOnMethods = ["testGet"])
    fun testRemove() {
        var size = list.size
        assertFalse(list.remove(1010101010))
        assertTrue(list.remove(3))
        assertEquals(list.get(0),5)
        assertEquals(list.size,--size)

        assertTrue(list.remove(123))
        assertEquals(list.get(list.size - 1),-123)
        assertEquals(list.size,--size)
    }

    @Test
    fun testContains() {
        assertTrue(list.contains(3))
        assertTrue(list.contains(-123))
        assertTrue(list.contains(6))
        assertFalse(list.contains(-111))
    }
}
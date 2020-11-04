import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

import org.testng.Assert.*
import org.testng.annotations.Test

class QueueImplTest {

    private var q = QueueImpl<String>()
    private val names = arrayOf("John","Jane","Bob")

    @BeforeMethod
    fun setUp() {
        for (str in names) {
            q.add(str)
        }
    }

    @AfterMethod
    fun tearDown() {
        q = QueueImpl<String>()
    }

    @Test(enabled=false)
    fun sanityChecks() {
        assertEquals(q.size,names.size)
        println(q)
    }

    @Test
    fun testPeek() {
        assertEquals(q.peek(), names[0])
    }

    @Test
    fun testPoll() {
        var initSize = q.size
        for (i in names.indices) {
            assertEquals(q.poll(),names[i])
            assertEquals(q.size, --initSize)
        }
    }

}
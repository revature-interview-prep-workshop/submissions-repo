import org.example.objects.Queue;
import org.junit.*;
import org.junit.Assert;

public class QueueTest {

    Queue<Integer> queue;

    @Test
    public void testPeek() {
        Integer temp = this.queue.peek().nodeData;
        Assert.assertEquals(5, (int) temp);

    }

    @Test
    public void testPeekAfterPoll() {
        this.queue.poll();
        Integer temp = this.queue.peek().nodeData;
        Assert.assertEquals(10, (int) temp);
    }

    @Test
    public void testPoll() {

        Integer temp = this.queue.poll().nodeData;
        Assert.assertEquals(5, (int) temp);
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        this.queue = new Queue<Integer>();

        this.queue.offer(5);
        this.queue.offer(10);
    }
}

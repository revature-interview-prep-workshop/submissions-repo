import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.data_structures.BinaryTree;
import com.revature.data_structures.Node;

public class BinaryTreeTest {
    private static BinaryTree bt;
  
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        bt = new BinaryTree();
        bt.insert(1, 33);
        bt.insert(2,44);
        bt.insert(3,55);
        bt.insert(4, 56);
        bt.insert(5, 66);
        bt.insert(6, 88);
        
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testContainsTrue() {
       assertTrue(bt.contains(1));
    }
    @Test
    public void testContainsFalse() {
        assertFalse(bt.contains(4));
    }
    @Test
    public void testContainsFalseEmptyBt() {
        BinaryTree vbt = new BinaryTree();
        assertFalse(vbt.contains(2));
        
    }
    @Test
    public void testContainsTrueIdMid() {
        assertFalse(bt.contains(3));
    }
    @Test
    public void testDeleteSuccess() {
        bt.delete(2);
        assertFalse(bt.contains(2));
    }
    @Test
    public void testDeleteSuccess2() {
        bt.delete(1);
        assertFalse(bt.contains(1));
    }
    @Test
    public void testDeleteSuccess3() {
        assertTrue(bt.delete(5));
    }
    @Test
    public void testDeleteFail() {
        assertFalse(bt.delete(7));
    }
    @Test
    public void testDeleteNullRoot() {
        BinaryTree vbt = new BinaryTree();
        assertFalse(vbt.delete(2));
    }
    @Test
    public void testDeleteCenter() {
        assertTrue(bt.delete(4));
    }
    @Test
    public void testDeleteLeftNull() {
        Node node = bt.find(5);
        node.leftChild = null;
        assertTrue(bt.delete(3));
        
    }
}

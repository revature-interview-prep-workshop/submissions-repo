import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.main.Driver;

public class TestDriverMethods {
    private Driver driver;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
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
    public void testReverseMethod() {
       assertEquals("321", driver.reverseAWord("123"));
    }
    @Test
    public void testReverseMethodFail() {
        assertNotEquals("321", driver.reverseAWord("321"));
    }
    @Test
    public void testReverseMethodVoidString() {
        assertEquals("", driver.reverseAWord(""));
    }
    @Test
    public void testCheckDelimeterTrue() {
        assertTrue(driver.checkDelimeter("{{()}}"));
    }
    @Test
    public void testCheckDelimeterTrueEmptyStack() {
        assertTrue(driver.checkDelimeter(""));
    }
    @Test
    public void testCheckDelimeterFalse() {
        assertFalse(driver.checkDelimeter("{{}"));
    }
    @Test
    public void testhCheckDelimeterFalse() {
        assertFalse(driver.checkDelimeter("{a"));
    }
    @Test
    public void testhCheckDelimeterFalseOnlyNonBrackets() {
        assertFalse(driver.checkDelimeter("{)"));
    }
}

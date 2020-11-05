package SudokuTDD;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.Revature.SudokuValidation.*;

public class ValidationTest {
	   
		private Validator val = new Validator();
	    
		private String[][] sudo1 = {{"5","3",".",".","7",".",".",".","."},
	                               {"6",".",".","1","9","5",".",".","."},
	                               {".","9","8",".",".",".",".","6","."},
	                               {"8",".",".",".","6",".",".",".","3"},
	                               {"4",".",".","8",".","3",".",".","1"},
	                               {"7",".",".",".","2",".",".",".","6"},
	                               {".","6",".",".",".",".","2","8","."},
	                               {".",".",".","4","1","9",".",".","5"},
	                               {".",".",".",".","8",".",".","7","9"}};
	    
	    private String[][] sudo2 = {{"8","3",".",".","7",".",".",".","."},
	                               {"6",".",".","1","9","5",".",".","."},
	                               {".","9","8",".",".",".",".","6","."},
	                               {"8",".",".",".","6",".",".",".","3"},
	                               {"4",".",".","8",".","3",".",".","1"},
	                               {"7",".",".",".","2",".",".",".","6"},
	                               {".","6",".",".",".",".","2","8","."},
	                               {".",".",".","4","1","9",".",".","5"},
	                               {".",".",".",".","8",".",".","7","9"}};
	    
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
	    public void testValid() {
	      assertTrue(val.isValid(val.Mapper(sudo1), sudo1));
	    }
	    @Test
	    public void testNotValid() {
	        assertFalse(val.isValid(val.Mapper(sudo2), sudo2));
	    }    
	
}

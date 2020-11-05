import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SudokuValidatorTest {

    private String[][] case1;
    private String[][] case2;

    @BeforeMethod
    public void setUp() {
        case1 = new String[][]{{"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}};

        case2 = new String[][]{{"8","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}};
    }

    @Test(enabled = false)
    public void sanityCheck() {
        for (String[] row : case1) {
            for (String e : row) {
                System.out.print(e + ",");
            }
            System.out.println();
        }

        System.out.println("------");

        for (String[] row: case2) {
            for (String e : row) {
                System.out.print(e + ",");
            }
            System.out.println();
        }
    }

    @Test
    public void testValidate() {
        assertTrue(SudokuValidator.validate(case1));
        assertFalse(SudokuValidator.validate(case2));
    }

    @Test
    public void testCheckRepeat() {
        assertTrue(SudokuValidator.checkRepeat(new String[]{".","1","2","3","4","."}));
        assertFalse(SudokuValidator.checkRepeat(new String[]{".","1","1"}));
    }

    @Test
    public void testCheckCol() {
        assertFalse(SudokuValidator.checkCol(case2));
        assertTrue(SudokuValidator.checkCol(case1));
    }
}
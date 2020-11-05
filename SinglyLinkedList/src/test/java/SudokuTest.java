import org.example.objects.SudokuSolver;
import org.junit.*;

public class SudokuTest {


    String[][] shouldFailThreeByThree = new String[][]{{"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","5",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}};

    String[][] shouldFailRowsAndColsOnCol = new String[][]{{"8","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","5",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}};

    String[][] shouldFailRowsAndColsOnRow = new String[][]
            {{"5","3",".",".","3",".",".",".","."},
             {"6",".",".","1","9","5",".",".","."},
             {".","9","8",".",".",".",".","6","."},
             {"8",".",".",".","6",".",".",".","3"},
             {"4",".",".","8",".","3",".",".","1"},
             {"7",".",".",".","2",".",".",".","6"},
             {".","6",".",".",".",".","2","8","."},
             {".",".",".","4","1","9",".",".","5"},
             {".",".",".",".","8",".",".","7","9"}};

    String[][] shouldPass = new String[][]{{"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}};



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {


    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Test
    public void validateThreeByThreesReturnsFalse() {
        SudokuSolver sudokuSolver = new SudokuSolver(this.shouldFailThreeByThree);
        Assert.assertFalse(sudokuSolver.validateThreeByThrees());
    }

    @Test
    public void validateThreeByThreesReturnsTrue() {
        SudokuSolver sudokuSolver = new SudokuSolver(this.shouldPass);
        Assert.assertTrue(sudokuSolver.validateThreeByThrees());
    }

    @Test
    public void validateRowsAndColumnsReturnsFalseOnRow() {
        SudokuSolver sudokuSolver = new SudokuSolver(this.shouldFailRowsAndColsOnRow);
        Assert.assertFalse(sudokuSolver.validateRowsAndCols());
    }


    @Test
    public void validateRowsAndColumnsReturnsFalseOnCol() {

        SudokuSolver sudokuSolver = new SudokuSolver(this.shouldFailRowsAndColsOnCol);
        Assert.assertFalse(sudokuSolver.validateRowsAndCols());
    }

    @Test
    public void validateRowsAndColumnsReturnsTrue() {

            SudokuSolver sudokuSolver = new SudokuSolver(this.shouldPass);
            Assert.assertTrue(sudokuSolver.validateRowsAndCols());
    }

    @Test
    public void validateBoardReturnsTrue() {
        SudokuSolver sudokuSolver = new SudokuSolver(this.shouldPass);
        Assert.assertTrue(sudokuSolver.validateBoard());
    }
}


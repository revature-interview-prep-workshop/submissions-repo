import org.example.objects.LinkedList;
import org.example.objects.Queue;
import org.example.objects.Stack;
import org.example.objects.SudokuSolver;

public class Driver {

    public static void main(String[] args) {

        SudokuSolver sudokuSolver = new SudokuSolver(
                new String[][]{{"5","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","5",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}});

        System.out.println(sudokuSolver.validateThreeByThrees());
        System.out.println(sudokuSolver.validateRowsAndCols());
        System.out.println(sudokuSolver.validateBoard());
    }
}

package sudoku;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SudokuTest {
    
    private Board board;
    
    private String[][] sudoku = {
            {".", ".", ".", "2", "6" ,"." ,"7" ,"." ,"1"},
            {"6", "8", ".", ".", "7" ,"." ,"." ,"9" ,"."},
            {"1", "9", ".", ".", "." ,"4" ,"5" ,"." ,"."},
            {"8", "2", ".", "1", "." ,"." ,"." ,"4" ,"."},
            {".", ".", "4", "6", "." ,"2" ,"9" ,"." ,"."},
            {".", "5", ".", ".", "." ,"3" ,"." ,"2" ,"8"},
            {".", ".", "9", "3", "." ,"." ,"." ,"7" ,"4"},
            {".", "4", ".", ".", "5" ,"." ,"." ,"3" ,"6"},
            {"7", ".", "3", ".", "1" ,"8" ,"." ,"." ,"."},
    };
    
    @Before
    public void initBoard() {
        board = new Board(sudoku);
    }
    
    
    @Test
    public void validateRowArray() {
        String[] expected = {"1", "9", ".", ".", "." ,"4" ,"5" ,"." ,"."};
        String[] actual = board.getRow(2);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void validateRowLength() {
        int expected = 9;
        int actual = board.getRow(2).length;
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void RowContainsDuplicates() {
        String[][] invalidBoard = {
                {".", ".", ".", "2", "6" ,"2" ,"7" ,"." ,"1"},
                {"6", "8", ".", ".", "7" ,"." ,"." ,"9" ,"."},
                {"1", "9", ".", ".", "." ,"4" ,"5" ,"." ,"."},
                {"8", "2", ".", "1", "." ,"." ,"." ,"4" ,"."},
                {".", ".", "4", "6", "." ,"2" ,"9" ,"." ,"."},
                {".", "5", ".", ".", "." ,"3" ,"." ,"2" ,"8"},
                {".", ".", "9", "3", "." ,"." ,"." ,"7" ,"4"},
                {".", "4", ".", ".", "5" ,"." ,"." ,"3" ,"6"},
                {"7", ".", "3", ".", "1" ,"8" ,"." ,"." ,"."},
        };
        board = new Board(invalidBoard);
        boolean expected = false;
        boolean actual = board.checkRow(board.getRow(0));
        assertEquals(expected, actual);
    }
    
    @Test
    public void RowDoesNotContainDuplicates() {
        board = new Board(sudoku);
        boolean expected = true;
        boolean actual = board.checkRow(board.getRow(0));
        assertEquals(expected, actual);
    }
    
    @Test
    public void validateColArray() {
        String[] expected = {".", "6", "1", "8", "." ,"." ,"." ,"." ,"7"};
        String[] actual = board.getCol(0);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void validateColLength() {
        int expected = 9;
        int actual = board.getCol(5).length;
        assertEquals(expected, actual);
    }
    
    @Test
    public void ColDoesNotContainDuplicates() {
        board = new Board(sudoku);
        boolean expected = true;
        boolean actual = board.checkCol(board.getRow(0));
        assertEquals(expected, actual);
    }
    
    @Test
    public void ColContainsDuplicates() {
        String[][] invalidBoard = {
                {".", ".", ".", "2", "6" ,"2" ,"7" ,"." ,"1"},
                {"6", "8", ".", ".", "7" ,"." ,"." ,"9" ,"."},
                {"1", "9", ".", ".", "." ,"4" ,"5" ,"." ,"."},
                {"8", "2", ".", "1", "." ,"." ,"." ,"4" ,"."},
                {".", ".", "4", "6", "." ,"2" ,"9" ,"." ,"."},
                {"8", "5", ".", ".", "." ,"3" ,"." ,"2" ,"8"},
                {".", ".", "9", "3", "." ,"." ,"." ,"7" ,"4"},
                {".", "4", ".", ".", "5" ,"." ,"." ,"3" ,"6"},
                {"7", ".", "3", ".", "1" ,"8" ,"." ,"." ,"."},
        };
        board = new Board(invalidBoard);
        boolean expected = false;
        boolean actual = board.checkCol(board.getRow(0));
        assertEquals(expected, actual);
    }
    
    @Test
    public void validateSqreLength() {
        int expected = 9;
        int actual = board.getSqre(0, 0).length;
        assertEquals(expected, actual);
    }
    
    @Test
    public void validateSqreArray() {
        String[] expected = {".", ".", ".", "6", "8" ,"." ,"1" ,"9" ,"."};
        String[] actual = board.getSqre(0, 0);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void SqreDoesNotContainDuplicates() {
        board = new Board(sudoku);
        boolean expected = true;
        boolean actual = board.checkCol(board.getSqre(0, 0));
        assertEquals(expected, actual);
    }
    
    @Test
    public void SqreContainsDuplicates() {
        String[][] invalidBoard = {
                {".", "6", ".", "2", "6" ,"2" ,"7" ,"." ,"1"},
                {"6", "8", ".", ".", "7" ,"." ,"." ,"9" ,"."},
                {"1", "9", ".", ".", "." ,"4" ,"5" ,"." ,"."},
                {"8", "2", ".", "1", "." ,"." ,"." ,"4" ,"."},
                {".", ".", "4", "6", "." ,"2" ,"9" ,"." ,"."},
                {"8", "5", ".", ".", "." ,"3" ,"." ,"2" ,"8"},
                {".", ".", "9", "3", "." ,"." ,"." ,"7" ,"4"},
                {".", "4", ".", ".", "5" ,"." ,"." ,"3" ,"6"},
                {"7", ".", "3", ".", "1" ,"8" ,"." ,"." ,"."},
        };
        board = new Board(invalidBoard);
        boolean expected = false;
        boolean actual = board.checkCol(board.getSqre(0, 0));
        assertEquals(expected, actual);
    }
    
}

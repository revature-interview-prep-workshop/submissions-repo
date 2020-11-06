import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import validator.SudokuValidator;

public class SudokuValidatorTests {

	public SudokuValidator valid = new SudokuValidator();
	
	public String[][] board1 = 
   {{"5","3",".",".","7",".",".",".","."},
	{"6",".",".","1","9","5",".",".","."},
	{".","9","8",".",".",".",".","6","."},
	{"8",".",".",".","6",".",".",".","3"},
	{"4",".",".","8",".","3",".",".","1"},
	{"7",".",".",".","2",".",".",".","6"},
	{".","6",".",".",".",".","2","8","."},
	{".",".",".","4","1","9",".",".","5"},
	{".",".",".",".","8",".",".","7","9"}};
	
	public String[][] board2 = 
   {{"8","3",".",".","7",".",".",".","."},
	{"6",".",".","1","9","5",".",".","."},
	{".","9","8",".",".",".",".","6","."},
	{"8",".",".",".","6",".",".",".","3"},
	{"4",".",".","8",".","3",".",".","1"},
	{"7",".",".",".","2",".",".",".","6"},
	{".","6",".",".",".",".","2","8","."},
	{".",".",".","4","1","9",".",".","5"},
	{".",".",".",".","8",".",".","7","9"}};

	
	@Test
	public void validRow() {
		Assertions.assertEquals(true, valid.validateRows(board1));
	}
	
	@Test
	public void validColumn() {
		Assertions.assertEquals(false, valid.validateColumns(board2));
	}
	
	@Test
	public void validPuzzle() {
		Assertions.assertEquals(true, valid.validatePuzzle(board1));
	}
	
	@Test
	public void validSquares() {
		Assertions.assertEquals(false, valid.validateSquares(board1));
	}
}

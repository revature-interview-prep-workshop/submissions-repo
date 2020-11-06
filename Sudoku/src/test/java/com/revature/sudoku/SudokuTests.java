package com.revature.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuTests {
	
	Sudoku sudoku = new Sudoku(); 
	Driver driver = new Driver(); 
	
	char[][] board1=
		{{'5','3','.','.','7','.','.','.','.'},
		{'6','.','.','1','9','5','.','.','.'},
		{'.','9','8','.','.','.','.','6','.'},
		{'8','.','.','.','6','.','.','.','3'},
		{'4','.','.','8','.','3','.','.','1'},
		{'7','.','.','.','2','.','.','.','6'},
		{'.','6','.','.','.','.','2','8','.'},
		{'.','.','.','4','1','9','.','.','5'},
		{'.','.','.','.','8','.','.','7','9'}};
	//dummy data
	char[][] board2 = 
		{{'8','3','.','.','7','.','.','.','.'},
		{'6','.','.','1','9','5','.','.','.'},
		{'.','9','8','.','.','.','.','6','.'},
		{'8','.','.','.','6','.','.','.','3'},
		{'4','.','.','8','.','3','.','.','1'},
		{'7','.','.','.','2','.','.','.','6'},
		{'.','6','.','.','.','.','2','8','.'},
		{'.','.','.','4','1','9','.','.','5'},
		{'.','.','.','.','8','.','.','7','9'}};
	
	@Test
	public void boardIsNotNull() {
	    assertNotNull(sudoku.isValidSudoku(null) );
	}
	
	@Test
	public void boardOneIsTrue() {
	    assertEquals(true,sudoku.isValidSudoku(board1) );
	}
	
	@Test
	public void boardTwoIsFalse() {
	    assertEquals(false, sudoku.isValidSudoku(board2) );
	}
	
	@Test
	public void arraysAreNotEqual() {
		assertNotSame(board1, board2);
	}

}

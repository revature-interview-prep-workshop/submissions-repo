package com.revature.Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.revature.services.Validator;

public class SudokuTests {

	Validator v = new Validator();
		
		public String[][] board1=
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
	public void testValidator1() {
		assertEquals(v.isValid(board1),true);
	}
	
	@Test
	public void testValidator2() {
		assertEquals(v.isValid(board2),false);
	}

	@Test
	public void testSquare1() {
		assertEquals(v.validateSquares(board1),true);
	}
	
	@Test
	public void testSquare2() {
		assertEquals(v.validateSquares(board2),true);
	}
	
	@Test
	public void testDiagonal() {
		fail("Not yet implemented");
	}
	@Test
	public void testHorizontal() {
		fail("Not yet implemented");
	}
	@Test
	public void testVertical() {
		fail("Not yet implemented");
	}
}

package com.revature;

import org.junit.Assert;
import org.junit.Test;

public class SudokuBoardTest {

    SudokuBoard sut1 = new SudokuBoard(new String[][]{
        {"5","3",".",".","7",".",".",".","."},
        {"6",".",".","1","9","5",".",".","."},
        {".","9","8",".",".",".",".","6","."},
        {"8",".",".",".","6",".",".",".","3"},
        {"4",".",".","8",".","3",".",".","1"},
        {"7",".",".",".","2",".",".",".","6"},
        {".","6",".",".",".",".","2","8","."},
        {".",".",".","4","1","9",".",".","5"},
        {".",".",".",".","8",".",".","7","9"}});
    SudokuBoard sut2 = new SudokuBoard(new String[][]{
        {"8","3",".",".","7",".",".",".","."},
        {"6",".",".","1","9","5",".",".","."},
        {".","9","8",".",".",".",".","6","."},
        {"8",".",".",".","6",".",".",".","3"},
        {"4",".",".","8",".","3",".",".","1"},
        {"7",".",".",".","2",".",".",".","6"},
        {".","6",".",".",".",".","2","8","."},
        {".",".",".","4","1","9",".",".","5"},
        {".",".",".",".","8",".",".","7","9"}});

    @Test
    public void isBoardValidPositiveTest() {
        boolean actualResult = sut1.isValid();
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isBoardValidNegativeTest() {
        boolean actualResult = sut2.isValid();
        boolean expectedResult = false;

        Assert.assertEquals(expectedResult, actualResult);
    }


}

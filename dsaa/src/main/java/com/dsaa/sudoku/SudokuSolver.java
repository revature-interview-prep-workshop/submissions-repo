package com.dsaa.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {
    String[][] sudokuBoard;

    public SudokuSolver(String[][] sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }


    public boolean validateBoard() {
        return this.validateThreeByThrees() && this.validateRowsAndCols();
    }


    public boolean validateThreeByThrees() {
        // Index 0, Index 3, and Index 6;
        /*
            [["8","3",".",".","7",".",".",".","."],
            ["6",".",".","1","9","5",".",".","."],
            [".","9","8",".",".",".",".","6","."],
            ["8",".",".",".","6",".",".",".","3"],
            ["4",".",".","8",".","3",".",".","1"],
            ["7",".",".",".","2",".",".",".","6"],
            [".","6",".",".",".",".","2","8","."],
            [".",".",".","4","1","9",".",".","5"],
            [".",".",".",".","8",".",".","7","9"]]
         */

        for(int i = 0; i <= 6; i = i + 3) {
            for(int j = 0; j <= 6; j = j + 3) {
                Set<String> numbers = new HashSet<String>();
                for (int k = 0; k <= 2; k++) {
                    for(int g = 0; g <= 2; g++) {
                        String curr = this.sudokuBoard[i + k][j + g];
                        if(!curr.equals(".")) {
                            boolean added = numbers.add(curr);
                            if (!added) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    public boolean validateRowsAndCols() {
        for(int i = 0; i < 9; i++) {

            Set<String> rowSet = new HashSet<String>();
            Set<String> colSet = new HashSet<String>();
            for (int j = 0; j < 9; j++) {
                String rowString = this.sudokuBoard[i][j];
                String colString = this.sudokuBoard[j][i];

                if (!rowString.equals(".")) {
                    boolean added = rowSet.add(rowString);
                    if (!added) {
                        return false;
                    }
                }

                if (!colString.equals(".")) {
                    boolean added = colSet.add(colString);
                    if (!added) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
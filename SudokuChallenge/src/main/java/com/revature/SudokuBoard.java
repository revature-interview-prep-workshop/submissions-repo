package com.revature;

import java.util.HashSet;

public class SudokuBoard {

    private String[][] board;

    public SudokuBoard() {
        this.board = new String[][]{
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", ".", "."}};

    }

    public SudokuBoard(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public boolean isValid() {
        HashSet<String> rowSet = new HashSet<String>();
        HashSet<String> columnSet = new HashSet<String>();
        HashSet<String> boxSet = new HashSet<String>();
        for(int i = 0; i <= 8; i++ ) {
            for(int j = 0; j<=8; j++ ) {
                if (rowSet.contains(String.valueOf(board[i][j]))) {
                    System.out.println("false" + i + " " + j + " row");

                    return false;
                }
                if (!board[i][j].equals(".")) {
                    rowSet.add(String.valueOf(board[i][j]));
                }

                if (columnSet.contains(String.valueOf(board[j][i]))) {
                    System.out.println("false" + i + " " + j + " column");
                    return false;
                }
                if (!board[j][i].equals(".")) {
                    columnSet.add(String.valueOf(board[j][i]));
                }
            }

            rowSet = new HashSet<String>();
            columnSet = new HashSet<String>();
        }
        for(int i = 0; i <= 6; i += 3) {
            for(int j = 0; j <= 6; j += 3) {
                if(!board[i][j].equals(".")) {
                    if(boxSet.contains(String.valueOf(board[i][j]))){
                        System.out.println("false" + i + " " + j  + " box");
                        return false;
                    }
                    boxSet.add(String.valueOf(board[i][j]));
                }
                if(!board[i][j + 1].equals(".")) {
                    if(boxSet.contains(String.valueOf(board[i][j + 1]))){
                        System.out.println("false" + i + " " + (j + 1)  + " box");
                        return false;
                    }
                    boxSet.add(String.valueOf(board[i][j+1]));
                }
                if(!board[i][j + 2].equals(".")) {
                    if(boxSet.contains(String.valueOf(board[i][j+2]))){
                        System.out.println("false" + i + " " + (j + 2) + " box");
                        return false;
                    }
                    boxSet.add(String.valueOf(board[i][j+2]));
                }
            }
            boxSet = new HashSet<String>();
        }



        return true;
    }
}

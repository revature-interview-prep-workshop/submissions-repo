package com.revature.SudokuValidator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SudokuValidator {
    String[][] sudokuBoard;
    
    public SudokuValidator(String[][] sB) {
        this.sudokuBoard = sB;
    }
    public SudokuValidator() {
        super();
    }
    public Map<Integer, String[]> toMap(String[][] sB) {
        Map<Integer, String[]> m = new HashMap<Integer,String[]>();
        for(int row = 0; row < sB.length; row++) {
            m.put(row, sB[row]);    
        }
        for (Map.Entry<Integer, String[]> entry : m.entrySet()) {
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + Arrays.toString(entry.getValue()));
        }
        return m;
    }
    public boolean isValid(Map<Integer, String[]> m, String[][] sb) {
        //horizontal
        for(Map.Entry<Integer, String[]> entry :  m.entrySet()) {
            HashSet<String> set = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                if(!set.add(entry.getValue()[i]) && !(entry.getValue()[i].equals("."))) {
                    return false;
                }
            }
        }
        //vertical
        for(int i = 0; i < 9; i++) {
            HashSet<String> set = new HashSet<>();
            for(Map.Entry<Integer, String[]> entry: m.entrySet()) {
                if(!set.add(entry.getValue()[i]) &&  !(entry.getValue()[i].equals("."))) {
                    return false;
                }
            }
        }
        if(!isInnerSquareValid(sb, 0 , 0)) {
            return false;
        }
        return true;
    }
    public boolean isInnerSquareValid(String[][] sb, int row, int column) {
        int startRow = row - (row%3);
        int startCol = column - (column%3);
        HashSet<String> set = new HashSet<>();
        if(row > 8 || column > 8) {
            return true;
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(!set.add(sb[i + startRow][j + startCol]) && !(sb[i + startRow][j + startCol]).equals(".")) {
                    return false;
                }    
            }
        }
        return isInnerSquareValid(sb, startRow + 3, startCol + 3);
    }
   
}

package com.Revature.SudokuValidation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Validator {
	
	String[][] Board;
	
	public Validator(String[][] board) {
		this.Board = board;
	}
	
	public Validator() {
		super();
	}
	
	//MAP
	public Map<Integer , String[]> Mapper(String[][] board) {
		
		Map<Integer, String[]> map = new HashMap<Integer, String[]>();
		
		for(int row = 0; row <board.length; row++) {
			map.put(row, board[row]);
		}
		for(Map.Entry<Integer, String[]> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + 
                    ", Value = " + Arrays.toString(entry.getValue()) + "  ");
		}
		return map;
	}
	
	//Validation Methods
    public boolean isValid(Map<Integer, String[]> m, String[][] sb) {
        
    	//HORIZONTAL
        for(Map.Entry<Integer, String[]> entry :  m.entrySet()) {
            HashSet<String> set = new HashSet<String>();
           
            for(int i = 0; i < 9; i++) {
                if(!set.add(entry.getValue()[i]) && !(entry.getValue()[i].equals("."))) {
                    return false;
                }
            }
        }
        
        //VERTICAL
        for(int i = 0; i < 9; i++) {
            HashSet<String> set = new HashSet<String>();
            
            for(Map.Entry<Integer, String[]> entry: m.entrySet()) {
                if(!set.add(entry.getValue()[i]) &&  !(entry.getValue()[i].equals("."))) {
                    return false;
                }
            }
        }
        if(!InteriorSquareValid(sb, 0 , 0)) {
            return false;
        }
        return true;
    }
    
    //Validates the interior square
    public boolean InteriorSquareValid(String[][] sb, int row, int column) {
        int initialRow = row - (row%3);
        int initialCol = column - (column%3);
        HashSet<String> set = new HashSet<String>();
        
        if(row > 8 || column > 8) {
            return true;
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(!set.add(sb[i + initialRow][j + initialCol]) && !(sb[i + initialRow][j + initialCol]).equals(".")) {
                    return false;
                }    
            }
        }
        return InteriorSquareValid(sb, initialRow + 3, initialCol + 3);
    }
	
	
}



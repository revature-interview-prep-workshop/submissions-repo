package validator;

import java.util.ArrayList;

public class SudokuValidator {

	public boolean validateRows(String[][] rows) {
		for(int i=0;i<rows.length;i++) {
			ArrayList<Character> list = new ArrayList<>();
			for(int j=0;j<rows[i].length;j++) {
//				System.out.println(rows[i][j]);
				if(rows[i][j].charAt(0)=='.') continue;
				if(!list.contains(rows[i][j].charAt(0))) {
					list.add(rows[i][j].charAt(0));
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean validateSquares(String[][] square) {
		int maxrows = 3;
		int maxcols = 3;
		int currentcol = 0;
		int currentrow = 0;
		
		while(currentrow < maxrows && currentcol < maxcols) {
			ArrayList<Character> list = new ArrayList<>();
			for(int i=currentcol*maxcols;i<maxrows*(currentcol+1);i++) {
				
				for(int j=currentrow*maxrows;j<maxrows*(currentrow+1);j++) {
					System.out.println(square[i][j]);
					if(square[i][j].charAt(0)=='.') continue;
					if(!list.contains(square[i][j].charAt(0))) {
						list.add(square[i][j].charAt(0));
					} else {
						return false;
					}
				}
			}
			System.out.println(list);
			currentcol++;
			currentrow++;
			list.removeAll(list);
		}
		
		return true;
	}
	
	public boolean validateColumns(String[][] cols) {
		for(int i=0;i<cols.length;i++) {
			ArrayList<Character> list = new ArrayList<>();
			for(int j=0;j<cols[i].length;j++) {
//				System.out.println(cols[j][i]);
				if(cols[j][i].charAt(0)=='.') continue;
				if(!list.contains(cols[j][i].charAt(0))) {
					list.add(cols[j][i].charAt(0));
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean validatePuzzle(String[][] puzzle) {
		return puzzle.length == 9 && puzzle[0].length == 9;
	}
}

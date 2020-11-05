package Sudoku;
import java.util.HashMap;

public class SudokuValidator {
	public static boolean mainFunction(String[][] board) {
		HashMap<Integer, Integer>[] rows = new HashMap[9];
		HashMap<Integer, Integer>[] columns = new HashMap[9];
		HashMap<Integer, Integer>[] cubes = new HashMap[9];
		
		for(int i = 0; i < 9; i++) {
			rows[i] = new HashMap<Integer, Integer>();
			columns[i] = new HashMap<Integer, Integer>();
			cubes[i] = new HashMap<Integer, Integer>();
		}
		
		for(int j = 0; j < 9; j++) {
			for(int k = 0; k < 9; k++) {
				String num = board[j][k];
				if(num != ".") {
					int n = Integer.parseInt(num);
					int cube_index = (j/3) * 3 + k/3;
					
					rows[j].put(n, rows[j].getOrDefault(n, 0)+1);
					columns[k].put(n, columns[k].getOrDefault(n, 0)+1);
					cubes[cube_index].put(n, cubes[cube_index].getOrDefault(n, 0)+1);
					
					if(rows[j].get(n) > 1 || columns[k].get(n) > 1 || cubes[cube_index].get(n) > 1) {
						return false;
					}
				}		
			}
		}
		
		return true;
	}

}

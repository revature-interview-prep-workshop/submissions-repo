package sudokuValidate;

import java.util.HashSet;
import java.util.Set;

/*
 * Joseph Burss and Yuanfeng Gu
 * worked on this solution, along with one that Gu came up with
 * 
 * this one is not working totally, but is on the right track I think.
 */
public class Sudoku {	
	
	public static boolean validateRowAndCol(String[][] game) {
		for (int i = 0; i < 9; i++) {
			
			Set<String> rows = new HashSet<String>();
			Set<String> cols = new HashSet<String>();
			
			for (int j = 0; j < 9; j++) {
				if (!game[i][j].equals(".") && !rows.add(game[i][j])) {
					System.out.println("FALSE");
					return false;
				}
				if (!game[j][i].equals(".") && !cols.add(game[j][i])) {
					System.out.println("FALSE");
					return false;
				}
				else {
					System.out.println("TRUE");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean validateBoxes (String[][] game) {
		
		for (int i = 0; i < 9; i ++) {
			
			HashSet<String> boxes = new HashSet<String>();
			
			for (int j = 0; j < 9; j ++) {
				
				if (!game[i/3][j/3].equals(".") && !boxes.add(game[i/3][j/3])) {
					System.out.println("FALSE");
					return false;
				}
				else {
					System.out.println("TRUE");
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String[][] game1 = {{"5","3",".",".","7",".",".",".","."},
							{"6",".",".","1","9","5",".",".","."},
							{".","9","8",".",".",".",".","6","."},
							{"8",".",".",".","6",".",".",".","3"},
							{"4",".",".","8",".","3",".",".","1"},
							{"7",".",".",".","2",".",".",".","6"},
							{".","6",".",".",".",".","2","8","."},
							{".",".",".","4","1","9",".",".","5"},
							{".",".",".",".","8",".",".","7","9"}};
		
		String[][] game2 = {{"8","3",".",".","7",".",".",".","."},
							{"6",".",".","1","9","5",".",".","."},
							{".","9","8",".",".",".",".","6","."},
							{"8",".",".",".","6",".",".",".","3"},
							{"4",".",".","8",".","3",".",".","1"},
							{"7",".",".",".","2",".",".",".","6"},
							{".","6",".",".",".",".","2","8","."},
							{".",".",".","4","1","9",".",".","5"},
							{".",".",".",".","8",".",".","7","9"}};

		
		validateRowAndCol(game1);
		validateBoxes(game1);
		System.out.println("==================");
		
		//this solution is not totally working yet
		validateRowAndCol(game2);
		validateBoxes(game2);
	}
}

import java.util.Set;
import java.util.HashSet;

public class Sudoku {
	
	public boolean valid(String [][] board)
	{
		Set<String> values = new HashSet<>();
		
		for (int i =0; i < 9; i++)
		{
			for (int j =0; j < 9; j++)
			{
				if (board[i][j] != ".")
				{
					if(!values.add(board[i][j])) return false;
				}
			}
			
			values.clear();
		}
		
	
		
		for (int i =0; i < 9; i++)
		{
			for (int j =0; j < 9; j++)
			{
				if (board[j][i] != ".")
				{
					if(!values.add(board[j][i])) return false;
				}
			}
			
			values.clear();
		}
		
		gridCheck(board);
		
		return true;
	}
	
	public boolean gridCheck(String[][] board) 
	{
		Set<String> values = new HashSet<>();
		Set<String> values1 = new HashSet<>();
		Set<String> values2 = new HashSet<>();
		Set<String> values3 = new HashSet<>();
		Set<String> values4 = new HashSet<>();
		Set<String> values5 = new HashSet<>();
		Set<String> values6 = new HashSet<>();
		Set<String> values7 = new HashSet<>();
		Set<String> values8 = new HashSet<>();

		
		
		for (int i =0; i < 3; i++)
		{
			for (int j =0; j < 3; j++)
			{
				if (board[i][j] != ".")
				{
					if(!values.add(board[i][j])) return false;
					if(!values1.add(board[i+3][j])) return false;
					if(!values2.add(board[i+6][j])) return false;
					if(!values3.add(board[i][j+3])) return false;
					if(!values4.add(board[i][j+6])) return false;
					if(!values5.add(board[i+3][j+3])) return false;
					if(!values6.add(board[i+3][j+6])) return false;
					if(!values7.add(board[i+6][j+3])) return false;
					if(!values8.add(board[i+6][j+6])) return false;
				}
			}
		}
		return true;
	}
	
	public static void main (String[] args)
	{
		Sudoku test = new Sudoku();
		
		String [][] s = {{"5","3",".",".","7",".",".",".","."},
		                 {"6",".",".","1","9","5",".",".","."},
		                 {".","9","8",".",".",".",".","6","."},
		                 {"8",".",".",".","6",".",".",".","3"},
		                 {"4",".",".","8",".","3",".",".","1"},
		                 {"7",".",".",".","2",".",".",".","6"},
		                 {".","6",".",".",".",".","2","8","."},
		                 {".",".",".","4","1","9",".",".","5"},
		                 {".",".",".",".","8",".",".","7","9"}};
		
		String [][] s2 = {{"8","3",".",".","7",".",".",".","."},
						  {"6",".",".","1","9","5",".",".","."},
						  {".","9","8",".",".",".",".","6","."},
						  {"8",".",".",".","6",".",".",".","3"},
						  {"4",".",".","8",".","3",".",".","1"},
						  {"7",".",".",".","2",".",".",".","6"},
						  {".","6",".",".",".",".","2","8","."},
						  {".",".",".","4","1","9",".",".","5"},
						  {".",".",".",".","8",".",".","7","9"}};


		
		System.out.println(test.valid(s));
		System.out.println(test.valid(s2));

	}

}

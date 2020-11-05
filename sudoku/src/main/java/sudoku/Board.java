package sudoku;

public class Board {
    private final String[][] board;
    
    Board(String[][] sudoku) {
        board = sudoku;
    }
    
    public String[] getRow(int row) {
        return board[row];
    }
    
    public String[] getCol(int col) {
        String[] column = new String[9];
        
        for (int i = 0; i < 9; i++) {
            column[i] = board[i][col];
        }
        return column;
    }
    
    public String[] getSqre (int row, int col) {
        String[] sqre = new String[9];
        int r = row - (row % 3);
        int c = col - (col % 3);
        
        int counter = 0;
        for (int i = r; i < 3 + r; i++) {
            for (int j = c; j < 3 + c; j++) {
                sqre[counter++] = board[i][j];
            }
        }
        return sqre;
    }
    
    public boolean checkRow(String[] row)  {
        if (row.length > 9) {
            return false;
        }
        
        for (int r = 0; r < row.length; r++) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] != ".") {
                    if (row[i] == row[r] && i != r) {
                        return false;
                    }
                }
        
            }
        }
        return true; 
    }
    
    public boolean checkCol(String[] col) {
        if (col.length > 9) {
            return false;
        }
        
        for (int r = 0; r < col.length; r++) {
            for (int i = 0; i < col.length; i++) {
                if (col[i] != ".") {
                    if (col[i] == col[r] && i != r) {
                        return false;
                    }
                }
        
            }
        }
        return true;
    }
    
    public boolean checkSqre(String[] sqre) {
        if (sqre.length > 9) {
            return false;
        }
        
        for (int r = 0; r < sqre.length; r++) {
            for (int i = 0; i < sqre.length; i++) {
                if (sqre[i] != ".") {
                    if (sqre[i] == sqre[r] && i != r) {
                        return false;
                    }
                }
        
            }
        }
        return true;
    }
    
}

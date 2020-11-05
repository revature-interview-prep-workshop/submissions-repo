import java.util.Arrays;
import java.util.HashSet;

public class Sudoku {

   static char [][] board = new char[9][9];

    public static void board(int  r,int c,char number){


        board [c][r] = number;



        int col = board.length;
        int row = board.length;

        for (int i=0;i< col;i++){

            for (int j=0;j<row ;j++){
                board[i][j] = '.';
                board[r][c] = number;
                board [1][3] = '4';
                board [1][4] = '5';
                board[0][0]='9';
                board[1][0]='1';
                board[8][0]='7';
                board[8][8]='9';
                board[0][8]='1';


            }
        }

        System.out.println("   ");


        for (int i=0;i<col;i++)
            System.out.println ( Arrays.toString (board[i]));


    }


    public static boolean isValidSudoku(char[][] board){

        HashSet<String>  seen = new HashSet<>();

        for(int i=0;i<9;i++){

            for(int j=0;j<9;j++){

                char currentValue = board[i][j];
                if(currentValue !='.'){

                    if(!seen.add(currentValue+"found in row "+ i)||
                            !seen.add(currentValue +"found in colum " + j)||
                            !seen.add(currentValue +"found in subBox " + i/3 + " - " + j/3)){
                   return  false;}

                }

            }
        }
        return true;
    }
}

import java.util.HashSet;
import java.util.Set;

// Pai and Max
public class SudokuValidator {

    public static boolean validate(String[][] input) {
        // rows
        for (String[] row : input) {
            if (!checkRepeat(row)) {
                return false;
            }
        }
        // col
        checkCol(input);

        for(int i = 0; i < 3; i++) {
            i = i*3; // 0, 3, 6
            for (int a = 0; a < 3; a++) {
                a = a*3; // 0, 3, 6

                String[] arr = new String[9];
                arr[0] = input[a][i];
                arr[1] = input[a][i+1];
                arr[2] = input[a][i+2];

                arr[3] = input[a+1][i];
                arr[4] = input[a+1][i+1];
                arr[5] = input[a+1][i+2];

                arr[6] = input[a+2][i];
                arr[7] = input[a+2][i+1];
                arr[8] = input[a+2][i+2];
                if (!checkRepeat(arr)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkCol(String[][] input) {
        for (int i = 0; i < 9; i++) {
            String[] col = new String[9];
            for (int j = 0; j < 9; j++) {
                col[j] = input[j][i];
            }
            if (!checkRepeat(col)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRepeat(String[] arr) {
        Set<String> set = new HashSet<>();
        for (String element : arr) {
            if (!element.equals(".")) {
                if (!set.add(element)) {
                    return false;
                }
            }
        }
        return true;
    }

}

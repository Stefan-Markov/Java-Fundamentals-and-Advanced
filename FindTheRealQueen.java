import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        readMatrix(matrix, scan);

        checkMatrix(matrix);
    }

    private static void checkMatrix(char[][] matrix) {
        char symbol = 'q';
        int rowQueen = 0;
        int colQueen = 0;
        boolean isFoundRow = true;
        boolean isFoundCol = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (symbol == matrix[i][j]) {
                    int rows = i;
                    int cols = j;

                    if (isRowQueen(matrix, symbol, i) && isColQueen(matrix, symbol, j)) {
                        rowQueen = i;
                        colQueen = j;

                    }
                }
            }
        }

        System.out.println(rowQueen + " " + colQueen);
    }

    private static boolean isColQueen(char[][] matrix, char symbol, int j) {
        boolean isFoundCol;
        int col = 0;

        for (int i = 0; i < matrix[j].length; i++) {
            if (symbol == matrix[j][i]) {
                isFoundCol = false;
                return false;
            }
        }

        for (int i = matrix[j].length - 1; i >= 0; i--) {
            if (symbol == matrix[j][i]) {
                isFoundCol = false;
                return false;
            }
        }
        return true;
    }

    private static boolean isRowQueen(char[][] matrix, char symbol, int i) {
        boolean isFoundRow;
        for (int k = i; k < matrix[i].length; k++) {
            if (symbol == matrix[i][k]) {
                isFoundRow = false;
                return false;
            }
        }
        for (int k = matrix[i].length - 1; k >= i; k--) {
            if (symbol == matrix[i][k]) {
                isFoundRow = false;
                return false;
            }
        }
        return true;
    }

    private static void readMatrix(char[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            String line = scan.nextLine().replaceAll(" ", "");
            matrix[i] = line.toCharArray();
        }
    }

    private static boolean isValidPosition(char[][] matrix, int currentRow, int currentCol) {
        return currentRow >= 0 &&
                currentRow < matrix.length &&
                currentCol >= 0 &&
                currentCol < matrix.length;
    }
}

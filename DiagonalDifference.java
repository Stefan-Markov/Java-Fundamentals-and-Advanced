import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = scanMatrix(scan);
        int firstDiagonal = firstDiagonal(matrix);
        int secondDiagonal = secondDiagonal(matrix);

        System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    }

    private static int secondDiagonal(int[][] matrix) {

        int col = 0;
        int sum = 0;
        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = matrix[i][col++];
            sumDiagonal += sum;
        }
        return sumDiagonal;
    }

    private static int firstDiagonal(int[][] matrix) {
        int row = 0;
        int sum = 0;
        int sumDiagonal = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            sum = matrix[i][row++];
            sumDiagonal += sum;
        }
        return sumDiagonal;
    }

    private static int[][] scanMatrix(Scanner scan) {
        int size = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scan.nextInt();
            }
        }
        return matrix;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int maxSum = 0;

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int indexRow = 0;
        int indexCol = 0;
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int sum = sumCalculateMatrix(matrix, row, col);

                if (sum > maxSum) {
                    maxSum = sum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        printSubMatrix(matrix, indexRow, indexCol);
    }

    private static void printSubMatrix(int[][] matrix, int indexRow, int indexCol) {

        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol - 1; col <= indexCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int sumCalculateMatrix(int[][] matrix, int row, int col) {

        int sum = 0;

        sum += matrix[row][col];

        sum += matrix[row][col + 1];
        sum += matrix[row][col - 1];

        sum += matrix[row - 1][col];
        sum += matrix[row + 1][col];

        sum += matrix[row - 1][col + 1];
        sum += matrix[row - 1][col - 1];

        sum += matrix[row + 1][col - 1];
        sum += matrix[row + 1][col + 1];

        return sum;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int readMatrix = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[readMatrix][];

        readMat(matrix, scan, readMatrix);

        int[] position = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int positionNumber = matrix[position[0]][position[1]];
        int sum = 0;

        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == positionNumber) {
                    String add = (i + " " + j);
                    numbers.add(add);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == positionNumber) {
                    matrix[i][j] = getSum(matrix, i, j, sum, positionNumber, numbers);
                }
            }
        }
        printMatrix(matrix);
    }

    private static int getSum(int[][] matrix, int row, int col, int sum, int number, List<String> checking) {
        if (isValid(matrix, row + 1, col) && !isContains(col, checking, row + 1)) {

            sum += matrix[row + 1][col];

        }
        if (isValid(matrix, row - 1, col) && !isContains(col, checking, row - 1)) {

            sum += matrix[row - 1][col];

        }
        if (isValid(matrix, row, col - 1) && !isContains(col - 1, checking, row)) {

            sum += matrix[row][col - 1];

        }
        if (isValid(matrix, row, col + 1) && !isContains(col + 1, checking, row)) {

            sum += matrix[row][col + 1];

        }
        return sum;
    }

    private static boolean isContains(int col, List<String> checking, int i) {
        return checking.contains((i) + " " + col);
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] nums : matrix) {
            for (int num : nums
            ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void readMat(int[][] matrix, Scanner scan, int readMatrix) {
        for (int i = 0; i < readMatrix; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}

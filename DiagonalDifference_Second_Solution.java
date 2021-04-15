import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_Second_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scan);


        int first =  0;

        for (int i = 0; i < matrix.length; i++) {
            first +=matrix[i][i];
        }

        int second = 0;
        for (int i = matrix.length-1; i >=0 ; i--) {
            int col = matrix[0].length-1-i;
            second +=matrix[i][col];
        }
        System.out.println(Math.abs(first-second));
    }

    private static void fillMatrix(int[][] matrix, Scanner scan) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

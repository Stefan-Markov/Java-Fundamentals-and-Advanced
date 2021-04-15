import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int sum = 0;
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += ints[j];
            }
        }
        System.out.println(sum);
    }

    private static int[][] readMatrix(Scanner scan) {
        String[] definition = scan.nextLine().split(", ");

        int row = Integer.parseInt(definition[0]);
        int cols = Integer.parseInt(definition[1]);

        int[][] matrix = new int[row][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] input = scan.nextLine().split(", ");
            for (int j = 0; j < matrix[0].length; j++) {

                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }
}


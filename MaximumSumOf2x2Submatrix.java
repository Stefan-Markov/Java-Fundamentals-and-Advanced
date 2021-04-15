import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int biggestSum = Integer.MIN_VALUE;
        int biggestSumRow1 = -1;
        int biggestSumCols2 = -1;
        int biggestSumRow2 = -1;
        int biggestSumCols1 = -1;


        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {

                int currentSum = matrix[row][col] +
                        matrix[row + 1][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col + 1];
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                    biggestSumRow1 = matrix[row][col];
                    biggestSumRow2 = matrix[row][col + 1];
                    biggestSumCols1 = matrix[row + 1][col + 1];
                    biggestSumCols2 = matrix[row + 1][col];
                }
            }
        }
        System.out.println(biggestSumRow1 + " " + biggestSumCols2);
        System.out.println(biggestSumRow2 + " " + biggestSumCols1);
        System.out.println(biggestSum);
    }

    private static int[][] readMatrix(Scanner scan) {
        String[] definiton = scan.nextLine().split(", ");

        int row = Integer.parseInt(definiton[0]);
        int cols = Integer.parseInt(definiton[1]);

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

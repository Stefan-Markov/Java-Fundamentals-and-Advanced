import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scan);
        int[][] secondMatrix = readMatrix(scan);

        if (firstMatrix.length != secondMatrix.length ||
                firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }

    private static int[][] readMatrix(Scanner scan) {

        String line = scan.nextLine();
        String[] split = line.split(" ");
        int rows = Integer.parseInt(split[0]);
        int cols = Integer.parseInt(split[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            line = scan.nextLine();
            split = line.split(" ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(split[j]);
            }
        }
        return matrix;
    }
}

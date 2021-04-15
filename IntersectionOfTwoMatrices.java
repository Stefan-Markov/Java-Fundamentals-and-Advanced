import java.util.Scanner;

public class IntersectionOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] firstMatrix = readCharMatrix(scan, rows);
        char[][] secondMatrix = readCharMatrix(scan, rows);

        char[][] answers = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    answers[i][j] = firstMatrix[i][j];
                } else {
                    answers[i][j] = '*';
                }
            }
        }
        printMatrix(answers);
    }

    private static void printMatrix(char[][] answers) {
        for (char[] answer : answers) {
            for (char c : answer) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readCharMatrix(Scanner scan, int row) {

        char[][] matrix = new char[row][];

        for (int i = 0; i < row; i++) {
            String line = scan.nextLine().replaceAll(" ", "");
            matrix[i] = line.toCharArray();
        }
        return matrix;
    }
}

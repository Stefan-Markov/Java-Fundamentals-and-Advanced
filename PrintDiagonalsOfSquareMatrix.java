import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = readMatrix(scan);

        StringBuilder first = getSumPrimaryDiagonal(matrix);

        StringBuilder second = getSumSecondaryDiagonal(matrix);

        if (second.length() == 0 && first.length() == 0) {
            return;
        } else {
            second.deleteCharAt(second.length() - 1);
            first.delete(first.length() - 1, first.length());
            System.out.println(second);
            System.out.println(first);
        }
    }

    private static StringBuilder getSumSecondaryDiagonal(int[][] matrix) {
        int col = 0;
        StringBuilder second = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            second.append(matrix[i][col++]).append(" ");
        }
        return second;
    }

    private static StringBuilder getSumPrimaryDiagonal(int[][] matrix) {

        int col = 0;
        StringBuilder first = new StringBuilder();
        for (int i = matrix.length - 1; i >= 0; i--) {
            first.append(matrix[i][col++]).append(" ");
        }
        return first;
    }

    private static int[][] readMatrix(Scanner scan) {
        int number = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[number][number];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
}

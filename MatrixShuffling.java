import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        scan.nextLine();

        String[][] text = new String[rows][cols];

        for (int i = 0; i < text.length; i++) {
            text[i] = scan.nextLine().split(" ");
        }

        String input = scan.nextLine();

        while (!"END".equals(input)) {

            try {
                String[] swap = input.split(" ");

                if (!swap[0].equalsIgnoreCase("swap") && swap.length > 5) {
                    throw new IllegalStateException();
                }

                int r1 = Integer.parseInt(swap[1]);
                int c1 = Integer.parseInt(swap[2]);
                int r2 = Integer.parseInt(swap[3]);
                int c2 = Integer.parseInt(swap[4]);

                String temp = text[r1][c1];

                text[r1][c1] = text[r2][c2];

                text[r2][c2] = temp;
                printMatrix(text);
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {

                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] text) {

        for (String[] strings : text) {
            for (int j = 0; j < text[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}

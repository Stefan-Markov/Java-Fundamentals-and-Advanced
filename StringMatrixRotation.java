import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rotationsInput = scan.nextLine().split("[\\(\\)]");
        int rotationsInt = Integer.parseInt(rotationsInput[1]);

        int rotation = (rotationsInt / 90) % 4;

        String input = scan.nextLine();
        String line = "";

        int maxLength = 0;

        while (!input.equals("END")) {
            line += input + "\n";
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            String[] matrix = line.split("\n");
            input = scan.nextLine();
        }
        String[] matrix = line.split("\n");
        String output = "";

        switch (rotation) {
            case 0:
                System.out.println(line);
                break;
            case 1:
                for (int i = 0; i < maxLength; i++) {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        try {
                            output += matrix[j].charAt(i);
                        } catch (Exception e) {
                            output += " ";
                        }
                    }
                    output += "\n";
                }
                System.out.println(output);
                break;
            case 2:
                System.out.println(new StringBuilder(line).reverse());
                break;
            case 3:
                for (int i = maxLength; i >= 0; i--) {
                    for (int j = 0; j < matrix.length; j++) {
                        try {
                            output += matrix[j].charAt(i);
                        } catch (Exception e) {
                            output += " ";
                        }
                    }
                    output += "\n";
                }
                System.out.println(output);
                break;
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] ints : matrix) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

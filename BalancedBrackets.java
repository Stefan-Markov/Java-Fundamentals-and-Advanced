import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());


        int bracket = 0;
        int beam = 0;

        for (int i = 1; i <= number; i++) {
            String input = scan.nextLine();

            if (input.equals(")")) {
                bracket++;

            } else if (input.equals("(")) {
                beam++;
            }
        }

        if (bracket == beam) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

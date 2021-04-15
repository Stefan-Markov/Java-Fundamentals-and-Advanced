import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        final double precisionLevel = 0.000001f;

        if (Math.abs(a - b) >= precisionLevel) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}

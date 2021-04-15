import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        String input = scan.nextLine();

        int start = Math.min(first, second);
        int end = Math.max(first, second);

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int currCharInt = input.charAt(i);
            if (currCharInt > start && currCharInt < end) {
                sum += currCharInt;
            }
        }
        System.out.println(sum);
    }
}

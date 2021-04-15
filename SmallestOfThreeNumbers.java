import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = readInteger(scan);
        int b = readInteger(scan);
        int c = readInteger(scan);

        int min = numbers(a, b, c);

        System.out.println(min);
    }

    public static int numbers(int first, int sec, int third) {
        if (first < sec && first < third) {
            return first;
        } else if (sec < first && sec < third) {
            return sec;
        } else {
            return third;
        }
    }

    public static int readInteger(Scanner scanner) {
        int number = scanner.nextInt();
        return number;
    }
}

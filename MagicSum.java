import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int target = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {

            int currentNumber1 = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {

                int secNum = numbers[j];
                if (currentNumber1 + secNum == target) {
                    System.out.println(currentNumber1 + " " + secNum);
                }
            }
        }
    }
}

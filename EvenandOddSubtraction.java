import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");

        int[] values = new int[arr.length];

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            values[i] = Integer.parseInt(arr[i]);
            if (values[i] % 2 == 0) {
                evenSum += values[i];
            } else {
                oddSum += values[i];
            }
        }
        int result = (evenSum - oddSum);

        System.out.println(result);
    }
}

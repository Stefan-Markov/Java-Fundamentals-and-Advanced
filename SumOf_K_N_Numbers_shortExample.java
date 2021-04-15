import java.util.Scanner;

public class SumOf_K_N_Numbers_shortExample {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = getRead();
        int k = getRead();

        int[] numbers = new int[n];
        numbers[0] = 1;

        algorithm(n, k, numbers);

        printArr(numbers);

    }

    private static void algorithm(int n, int k, int[] numbers) {
        for (int i = 1; i < n; i++) {
//            int start = Math.max(0, i - k);
//            int end = i - 1;
            int sum = 0;
            for (int j = Math.max(0, i - k); j <= i - 1; j++) {
                sum += numbers[j];
            }
            numbers[i] = sum;
        }
    }

    private static int getRead() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void printArr(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

import java.util.Scanner;

public class SumOf_K_N_NumbersAlgorithm {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int size = getRead();
        int times = getRead();

        int[] numbers = new int[size];
        numbers[0] = 1;

        algorithm(size, times, numbers);

        printArr(numbers);
    }

    private static int getRead() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void algorithm(int size, int times, int[] numbers) {
        for (int i = 1; i < size; i++) {
            if (checkIndex(i, times)) {
                int sum = 0;
                for (int j = i - times; j < i; j++) {
                    sum += numbers[j];
                }
                numbers[i] = sum;
            } else {
                int check = times;
                while (!checkIndex(i, check)) {
                    check--;
                }
                int sum = 0;
                for (int j = 0; j < times; j++) {
                    sum = sum + numbers[j];
                }
                numbers[i] = sum;
            }
        }
    }

    private static void printArr(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    private static boolean checkIndex(int index, int times) {
        return index - times >= 0;
    }
}

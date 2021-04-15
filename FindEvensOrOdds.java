import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scan.nextLine();

        Predicate<String> isEven = str -> str.equals("even");
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        int start = numbers[0];
        int end = numbers[1];

        printNumbers(command, isEven, isEvenNumber, start, end);
    }

    private static void printNumbers(String command, Predicate<String> isEven, Predicate<Integer> isEvenNumber, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isEven.test(command) && isEvenNumber.test(i)) {
                System.out.print(i + " ");
            } else if (!isEvenNumber.test(i) && !isEven.test(command)) {
                System.out.print(i + " ");
            }
        }
    }
}

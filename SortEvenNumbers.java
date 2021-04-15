import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(x -> x % 2 != 0);
        Consumer<Integer> print = x -> System.out.print(x + " ");

        for (Integer num : numbers) {
            print.accept(num);
        }
        System.out.println();
        numbers.sort((a, b) -> a.compareTo(b));
        for (Integer num : numbers) {
            print.accept(num);
        }


    }
}

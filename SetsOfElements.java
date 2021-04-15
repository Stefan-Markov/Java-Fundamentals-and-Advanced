import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        LinkedHashSet<Integer> first = readSetOfNumbers(n, scan);

        LinkedHashSet<Integer> second = readSetOfNumbers(m, scan);

        first.retainAll(second);

        String collect = first.stream().map(i -> i + " ").collect(Collectors.joining());

        System.out.println(collect);
    }

    private static LinkedHashSet<Integer> readSetOfNumbers(int count, Scanner scan) {

        LinkedHashSet<Integer> number = new LinkedHashSet<>();

        while (count-- > 0) {
            number.add(scan.nextInt());
        }
        return number;
    }
}

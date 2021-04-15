import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        Set<String> elements = new TreeSet<>();

        while (n-- > 0) {
            elements.addAll(Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toSet()));
        }
        elements.forEach(s -> System.out.print(s + " "));
    }
}

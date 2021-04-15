import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithaStack {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> number = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" "))
                .forEach(number::push);

        while (!number.isEmpty()) {
            System.out.print(number.pop() + " ");
        }
    }
}

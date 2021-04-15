import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int input = Integer.parseInt(scan.nextLine());

        if (input == 0) {
            System.out.println(0);
            return;
        } else {
            while (input != 0) {
                stack.push(input % 2);
                input /= 2;
            }
        }
        for (int a : stack) {
            System.out.print(a);
        }
    }
}

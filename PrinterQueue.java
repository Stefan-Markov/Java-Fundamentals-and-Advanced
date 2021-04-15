import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Deque<String> deques = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (deques.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", deques.poll());
                }
            } else {
                deques.offer(input);
            }
            input = scan.nextLine();
        }
        for (String a : deques) {
            System.out.println(a);
        }
    }
}

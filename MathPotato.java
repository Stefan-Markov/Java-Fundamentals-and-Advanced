import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] children = input.split(" ");

        int number = Integer.parseInt(scan.nextLine());

        Deque<String> queue = new ArrayDeque<>(Arrays.asList(children));

        int currentRound = 1;

        while (queue.size() > 1) {
            String currentChild = queue.poll();
            if (currentRound % number != 0) {
                queue.offer(currentChild);
                currentRound++;
            } else {
                System.out.println("Removed " + currentChild);
                currentRound = 1;
                if (queue.size() > 1) {
                    for (String a : queue) {
                        System.out.println("Prime " + a);
                    }
                }
            }
        }
        System.out.println("Last is " + queue.poll());
    }
}

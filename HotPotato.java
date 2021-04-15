import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
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
            } else {

                System.out.println("Removed " + currentChild);
            }
            currentRound++;
        }
        System.out.println("Last is " + queue.poll());
    }
}

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToOffer = scan.nextInt();
        int numberToPoll = scan.nextInt();
        int lookNumber = scan.nextInt();

        ArrayDeque<Integer> number = new ArrayDeque<>();

        for (int i = 0; i < numberToOffer; i++) {
            number.offer(scan.nextInt());
        }

        for (int i = 0; i < numberToPoll; i++) {
            number.poll();
        }

        if (number.contains(lookNumber)) {
            System.out.println("true");
        } else {
            System.out.println(number.stream().min(Integer::compareTo).orElse(0));
        }
    }
}

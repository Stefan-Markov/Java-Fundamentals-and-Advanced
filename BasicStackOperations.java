import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToPush = scan.nextInt();
        int numberToPop = scan.nextInt();
        int lookNumber = scan.nextInt();

        ArrayDeque<Integer> number = new ArrayDeque<>();

        for (int i = 0; i < numberToPush; i++) {
            number.push(scan.nextInt());
        }
        for (int i = 0; i < numberToPop; i++) {
            number.pop();
        }

        if (number.contains(lookNumber)) {
            System.out.println("true");
        } else {
            if (!number.isEmpty()) {
                System.out.println(Collections.min(number));
            } else {
                System.out.println(0);
            }
        }
    }
}

package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        while (n-- > 0) {
            String line = scan.nextLine();
            GenericBox<Integer> box = new GenericBox<>(Integer.parseInt(line));

            System.out.println(box.toString());
        }
    }
}

package GenericBoxTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        while (n-- > 0) {
            String line = scan.nextLine();
            GenericBox<String> box = new GenericBox<>(line);

            System.out.println(box);
        }
    }
}

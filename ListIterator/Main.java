package ListIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] strings = Arrays.stream(scan.nextLine()
                .split(" ")).skip(1)
                .toArray(String[]::new);

        ListIterator listIterator = new ListIterator(strings);

        String input = scan.nextLine();

        while (!input.equals("END")) {

            switch (input) {
                case "Move":

                    System.out.println(listIterator.move());
                    break;
                case "HasNext":

                    System.out.println(listIterator.hasNext());
                    break;

                case "Print":
                    try {
                        System.out.println(listIterator.getCurrentElement());
                        break;
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
            }
            input = scan.nextLine();
        }
    }
}

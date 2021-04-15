import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char sec = scan.nextLine().charAt(0);

        if (first > sec) {
            print(sec, first);
        } else {
            print(first, sec);
        }
    }

    public static void print(char start, char end) {

        for (int i = start + 1; i < end; i++) {
            System.out.print(String.format("%c ", i));
        }
    }
}

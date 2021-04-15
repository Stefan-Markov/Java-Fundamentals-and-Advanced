import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int count = Integer.parseInt(scan.nextLine());

        int ascii = 0;

        for (int i = 1; i <= count; i++) {
            String alphabet = scan.nextLine();

            if (i <= count) {
                ascii = alphabet.charAt(0);
                ascii += key;
            }
            System.out.print((char) ascii);
        }
    }
}

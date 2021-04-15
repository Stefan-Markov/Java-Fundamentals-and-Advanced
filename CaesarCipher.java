import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        StringBuilder msg = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char letter = (char) (message.charAt(i) + 3);
            msg.append(letter);
        }
        System.out.println(msg);
    }
}

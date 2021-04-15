import java.util.Scanner;

public class ReverseStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        while (!"end".equals(words)) {
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length() - 1; i >= 0; i--) {
                reversed.append(words.charAt(i));
            }
            System.out.printf("%s = %s%n", words, reversed);
            words = scan.nextLine();
        }
    }
}

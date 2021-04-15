import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> book = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("stop")) {
            String mail = scan.nextLine();
            if (!mail.contains(".us") && !mail.contains(".uk") && !mail.contains(".com")) {

                book.put(input, mail);
            }

            input = scan.nextLine();
        }
        book.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}

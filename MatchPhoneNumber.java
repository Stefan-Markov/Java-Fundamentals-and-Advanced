import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        String phones = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher match = pattern.matcher(phones);

        List<String> phoneNumbers = new ArrayList<>();

        while (match.find()) {
            phoneNumbers.add(match.group());
        }
        System.out.println(String.join(", ", phoneNumbers));
    }
}

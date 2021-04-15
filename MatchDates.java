import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b(?<days>[\\d]{2})([-.\\/])(?<months>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String input = scan.nextLine();

        Pattern patter = Pattern.compile(regex);

        Matcher mather = patter.matcher(input);

        while (mather.find()) {

            String day = mather.group("days");
            String months = mather.group("months");
            String year = mather.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, months, year);
        }
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pattern patt = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]*\\b");

        String text = scan.nextLine();
        Matcher mach = patt.matcher(text);

        while (mach.find()) {
            System.out.print(mach.group() + " ");
        }
    }
}

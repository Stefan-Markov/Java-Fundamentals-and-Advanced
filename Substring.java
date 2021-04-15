import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bannedWords = scan.nextLine();
        String text = scan.nextLine();
        while (text.contains(bannedWords)) {
            text = text.replace(bannedWords, "");
        }
        System.out.println(text);
    }
}

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedWords = scan.nextLine().split(", ");

        String text = scan.nextLine();

        for (String bannedWord : bannedWords) {
            String replacement = generateReplacement(bannedWord.length());
            text = text.replace(bannedWord, replacement);
        }
        System.out.println(text);
    }

    public static String generateReplacement(int wordLength) {

        String[] parts = new String[wordLength];
        for (int i = 0; i < wordLength; i++) {
            parts[i] = "*";
        }
        return String.join("", parts);
    }
}

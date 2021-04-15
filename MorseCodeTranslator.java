import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|"};

        StringBuilder text = new StringBuilder();

        String[] input = scan.nextLine().split("[|]");

        for (String word : input) {
            String[] characters = word.split(" ");
            for (int h = 0; h < characters.length; h++) {
                for (int i = 0; i < morse.length; i++) {
                    if (characters[h].equals(morse[i])) {
                        text.append(english[i]);
                        break;
                    }
                }
            }
            text.append(" ");
        }
        System.out.println((text.toString().toUpperCase()));
    }
}


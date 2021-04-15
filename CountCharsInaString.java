import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();

        LinkedHashMap<Character, Integer> letters = new LinkedHashMap<>();

        for (char letter : input) {
            if (letter == ' ') {
                continue;
            }

            letters.putIfAbsent(letter, 0);

            int count = letters.get(letter);

            letters.put(letter, count + 1);
        }

        letters.forEach((key, value) -> System.out.println(String.format("%c -> %d", key, value)));
    }
}

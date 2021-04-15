import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                digit.append(current);
            } else if (Character.isLetter(current)) {
                letter.append(current);
            } else {
                chars.append(current);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(chars);
    }
}

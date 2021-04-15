import java.util.Scanner;

public class ReplaceRepeatingChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));

        for (int i = 1; i < input.length() - 1; i++) {
            char symbol = input.charAt(i);
            char symbol2 = input.charAt(i + 1);

            if (symbol == symbol2) {
                continue;
            } else {
                sb.append(symbol2);
            }
        }
        System.out.print(sb);
    }
}

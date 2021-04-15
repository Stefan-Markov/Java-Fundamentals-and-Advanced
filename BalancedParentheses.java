import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String parentheses = scan.nextLine();

        String lookup = "({[";

        boolean areBalanced = true;

        for (int i = 0; i < parentheses.length(); i++) {

            char symbol = parentheses.charAt(i);

            if (lookup.contains(symbol + "")) {
                stack.push(symbol);

            } else {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }

                char pop = stack.pop();

                if (!(pop == '(' && symbol == ')'
                        || pop == '[' && symbol == ']'
                        || pop == '{' && symbol == '}')) {
                    areBalanced = false;
                    break;
                }
            }
        }
        String output = areBalanced ? "YES" : "NO";
        System.out.println(output);
    }
}

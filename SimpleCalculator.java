import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] symbols = input.split(" ");

        if (symbols.length == 0) {
            return;
        }
        Deque<Integer> calculator = new ArrayDeque<>();

        calculator.push(Integer.parseInt(symbols[0]));
        for (int i = 1; i < symbols.length; i++) {

            String operation = symbols[i];
            int num = Integer.parseInt(symbols[++i]);

            int stackNum = calculator.pop();
            if ("+".equals(operation)) {
                calculator.push(num + stackNum);
            } else if ("-".equals(operation)) {
                calculator.push(stackNum - num);
            }
        }
        System.out.println(calculator.pop());
    }
}

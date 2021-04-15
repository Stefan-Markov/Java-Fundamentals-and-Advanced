import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String output = "";
        String line = scan.nextLine();

        Deque<String> history = new ArrayDeque<>();

        while (!line.equals("Home")) {
            if ("back".equals((line))) {
                if (history.size() <= 1) {
                    output = "no previous URLs";
                    System.out.println(output);
                } else {
                    history.pop();
                    output = history.peek();
                    System.out.println(output);
                }
            } else {
                history.push(line);
                System.out.println(line);
            }
            line = scan.nextLine();
        }
    }
}

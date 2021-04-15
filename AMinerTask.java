import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> info = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("stop")) {
            Integer resource = Integer.parseInt(scan.nextLine());

            if (!info.containsKey(input)) {
                info.putIfAbsent(input, resource);

            } else if (info.containsKey(input)) {
                info.put(input, resource + info.get(input));
            }

            input = scan.nextLine();
        }
        info.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}

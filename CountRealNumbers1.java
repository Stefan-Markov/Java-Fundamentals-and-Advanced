import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        String input = scan.nextLine();

        String[] split = input.split(" ");

        for (String element : split) {
            double dbl = Double.parseDouble(element);
            if (map.containsKey(dbl)) {
                int value = map.get(dbl);
                map.put(dbl, value + 1);
            } else {
                map.put(dbl, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            String format = String.format("%.1f -> %d", entry.getKey(), entry.getValue());
            System.out.println(format);
        }
    }
}

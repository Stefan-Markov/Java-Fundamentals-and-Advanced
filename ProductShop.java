import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        while (!input.equalsIgnoreCase("Revision")) {

            String[] tokens = input.split(", ");

            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if (!shops.containsKey(shop)) {
                shops.put(shop, new LinkedHashMap<>());
                shops.get(shop).put(product, price);

            } else if (shops.containsKey(shop)) {

                shops.get(shop).put(product, price);
            }
            input = scan.nextLine();
        }

        shops.forEach((key, value) -> {
            System.out.printf("%s->%n", key);

            for (Map.Entry<String, Double> a : value.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", a.getKey(), a.getValue());
            }
        });
    }
}

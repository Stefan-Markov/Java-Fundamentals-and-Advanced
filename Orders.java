import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        LinkedHashMap<String, List<Double>> orders = new LinkedHashMap<String, List<Double>>();

        while (!input.equals("buy")) {

            String[] items = input.split("\\s+");
            String item = items[0];

            double price = Double.parseDouble(items[1]);
            double quantity = Double.parseDouble(items[2]);

            if (!orders.containsKey(item)) {
                orders.put(item, new ArrayList<>());
                orders.get(item).add(0, price);
                orders.get(item).add(1, quantity);
            } else {
                double current = orders.get(item).get(1);
                orders.get(item).set(0, price);
                orders.get(item).set(1, quantity + current);
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : orders.entrySet()) {
            double a = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), a);
        }
    }
}

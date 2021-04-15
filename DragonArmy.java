import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scan.nextLine().split(" ");

            String type = tokens[0];
            String name = tokens[1];
            int[] data = new int[3];

            data[0] = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            data[1] = tokens[3].equals("null") ? 45 : Integer.parseInt(tokens[3]);
            data[2] = tokens[4].equals("null") ? 45 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }

            dragons.get(type).putIfAbsent(name, data);
            dragons.get(type).put(name, data);

        }
        System.out.println();

        dragons.forEach((k, v) -> {
            double[] avg = new double[3];

            v.forEach((k2, v2) -> {

                avg[0] += v2[0];
                avg[1] += v2[1];
                avg[2] += v2[2];

            });
            avg[0] /= v.size();
            avg[1] /= v.size();
            avg[2] /= v.size();

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", k, avg[0], avg[1], avg[2]));

            v.forEach((k1, v1) -> {
                System.out.println(String.format
                        ("-%s -> damage: %d, health: %d, armor: %d", k1, v1[0], v1[1], v1[2]));
            });
        });
    }
}

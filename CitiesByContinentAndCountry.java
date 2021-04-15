import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> towns = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scan.nextLine().split(" ");

            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!towns.containsKey(continent)) {

                towns.put(continent, new LinkedHashMap<>());
                towns.get(continent).put(country, new ArrayList<>());
                towns.get(continent).get(country).add(city);

            } else if (!towns.get(continent).containsKey(country)) {

                towns.get(continent).put(country, new ArrayList<>());
                towns.get(continent).get(country).add(city);

            } else {
                towns.get(continent).get(country).add(city);
            }
        }

        System.out.println();
        towns.forEach((k, v) -> {
            System.out.println(k + ":");

            for (Map.Entry<String, ArrayList<String>> a : v.entrySet()) {
                System.out.printf("  %s -> %s%n", a.getKey(), a.getValue().toString()
                        .replaceAll("[\\[\\]]", ""));
            }
        });
    }
}

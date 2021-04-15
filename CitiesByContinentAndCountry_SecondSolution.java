import java.util.*;

public class CitiesByContinentAndCountry_SecondSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, List<String>>> countries = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scan.nextLine().split(" ");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!countries.containsKey(continent)) {
                countries.put(continent, new LinkedHashMap<>());
                countries.get(continent).put(country, new ArrayList<>());
                countries.get(continent).get(country).add(city);

            } else {
                if (!countries.get(continent).containsKey(country)) {
                    countries.get(continent).put(country, new ArrayList<>());
                    countries.get(continent).get(country).add(city);
                } else {
                    countries.get(continent).get(country).add(city);
                }
            }
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ": ");

            for (Map.Entry<String, List<String>> value : entry.getValue().entrySet()) {
                System.out.println("  " + value.getKey() + " -> " + String.join(", ", value.getValue()));
            }
        }
    }
}

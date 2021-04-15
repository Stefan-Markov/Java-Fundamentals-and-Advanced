import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Long> countries = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> countriesCities = new HashMap<>();

        String input = scan.nextLine();

        while (!input.equals("report")) {

            String[] data = input.split("\\|");

            String city = data[0];
            String country = data[1];
            int population = Integer.parseInt(data[2]);

            Long countryPop = countries.get(country);

            if (countryPop == null) {

                countries.put(country, (long) population);
                Map<String, Integer> cityPop = new LinkedHashMap<>();
                cityPop.put(city, population);
                countriesCities.put(country, cityPop);

            } else {
                countries.replace(country, countryPop + population);
                countriesCities.get(country).put(city, population);
            }
            input = scan.nextLine();
        }

        countries.entrySet()
                .stream()
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                .forEach(p -> {
                    System.out.print(String.format("%s (total population: %d)%n", p.getKey(), p.getValue()));

                    countriesCities.get(p.getKey()).entrySet()
                            .stream()
                            .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                            .forEach(cp ->
                                    System.out.print(String.format("=>%s: %d%n", cp.getKey(), cp.getValue())));
                });

    }

    private static <T extends Comparable<T>> Comparator<Map.Entry<String, T>> reverseValueComparator() {
        return (p1, p2) -> p2.getValue().compareTo(p1.getValue());
    }
}


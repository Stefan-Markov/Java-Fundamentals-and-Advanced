import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СръбскоUnleashed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "^(?<singer>.+ ){1,3}@(?<venue>\\w+[^0-9]+ ){1,3}(?<price>\\d+) (?<count>\\d+)";

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);

        Map<String, Map<String, Integer>> performances = new LinkedHashMap<>();
        while (!input.equalsIgnoreCase("End")) {

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String singer = matcher.group("singer");
                String venue = matcher.group("venue");

                int price = Integer.parseInt(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                if (!performances.containsKey(venue)) {
                    performances.put(venue, new LinkedHashMap<>());
                }
                if (!performances.get(venue).containsKey(singer)) {
                    performances.get(venue).put(singer, 0);
                }
                int profit = performances.get(venue).get(singer) + price * count;
                performances.get(venue).put(singer, profit);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : performances.entrySet()) {
            System.out.println(entry.getKey().trim());

            entry.getValue().entrySet().stream().sorted((f, s) ->
                    s.getValue() - f.getValue()).forEach(k ->
                    System.out.println(String.format("#  %s-> %d", k.getKey(), k.getValue())));
        }
    }
}

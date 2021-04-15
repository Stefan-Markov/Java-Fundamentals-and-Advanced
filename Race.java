import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(", ");
        HashMap<String, Integer> results = new LinkedHashMap<>();
        ArrayList<String> racers = new ArrayList<>(Arrays.asList(data));

        Pattern names = Pattern.compile("[a-z]|[A-Z]");
        Pattern digits = Pattern.compile("[0-9]");

        String input = scan.nextLine();
        while (!"end of race".equals(input)) {

            Matcher nameMatcher = names.matcher(input);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            if (racers.contains(name.toString())) {
                results.putIfAbsent(name.toString(), 0);
                int oldKm = results.get(name.toString());
                int newKm = 0;

                Matcher digitMatcher = digits.matcher(input);
                while (digitMatcher.find()) {
                    newKm += Integer.parseInt(digitMatcher.group());
                }
                results.put(name.toString(), oldKm + newKm);
            }
            input = scan.nextLine();
        }

        int[] counter = {1};

        results.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).limit(3)
                .forEach(s -> {
                    switch (counter[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", s.getKey()));
                            counter[0]++;
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", s.getKey()));
                            counter[0]++;
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", s.getKey()));
                            break;
                    }
                });
    }
}

import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountSymbols {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<Character, Integer> characters = new TreeMap<>((f, s) -> f - s);

        for (char symbol : input.toCharArray()) {

            characters.putIfAbsent(symbol, 0);
            characters.put(symbol, characters.get(symbol) + 1);
        }

        System.out.println(
                characters.entrySet()
                        .stream()
                        .map(e -> String.format("%c: %d time/s", e.getKey(), e.getValue()))
                        .collect(Collectors.joining(System.lineSeparator())));
    }
}

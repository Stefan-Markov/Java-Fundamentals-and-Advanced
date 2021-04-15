import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        List<String> oddWord = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            if (counts.containsKey(lower)) {
                counts.put(lower, counts.get(lower) + 1);
            } else {
                counts.put(lower, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWord.add(entry.getKey());
            }
        }

        for (int i = 0; i < oddWord.size(); i++) {
            System.out.print(oddWord.get(i));
            if (i < oddWord.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

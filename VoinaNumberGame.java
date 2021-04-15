import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        Set<Integer> firstPlayerDeck = new LinkedHashSet<>();
        Set<Integer> secondPlayerDeck = new LinkedHashSet<>();

        for (String a : first) {
            firstPlayerDeck.add(Integer.parseInt(a));
        }

        for (String a : second) {
            secondPlayerDeck.add(Integer.parseInt(a));
        }


        int counter = 50;

        for (int i = 0; i < counter; i++) {
            if (firstPlayerDeck.size() != 0 && secondPlayerDeck.size() != 0) {

                int firstCardPlayer = firstPlayerDeck.iterator().next();
                firstPlayerDeck.remove(firstCardPlayer);

                int secondCardPlayer = secondPlayerDeck.iterator().next();
                secondPlayerDeck.remove(secondCardPlayer);


                if (firstCardPlayer > secondCardPlayer) {
                    firstPlayerDeck.add(firstCardPlayer);
                    firstPlayerDeck.add(secondCardPlayer);
                } else if (secondCardPlayer > firstCardPlayer) {
                    secondPlayerDeck.add(firstCardPlayer);
                    secondPlayerDeck.add(secondCardPlayer);
                }
            } else {
                break;
            }
        }

        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int swap = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[swap];
            words[swap] = temp;
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}

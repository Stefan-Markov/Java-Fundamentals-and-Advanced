import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] textAsList = scan.nextLine().split(" ");

        Predicate<String> checkerUpperCase =
                word -> Character.isUpperCase(word.charAt(0));
        int count = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < textAsList.length; i++) {
            if (checkerUpperCase.test(textAsList[i])) {
                count++;
                result.add(textAsList[i]);
            }
        }

        System.out.println(count);
        for (String res : result) {
            System.out.println(res);
        }
    }
}

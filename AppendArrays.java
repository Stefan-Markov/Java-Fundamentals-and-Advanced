import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");

        List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {

            String[] arr = input[i].trim().split("\\s+");

            result.addAll(Arrays.asList(arr));
        }

        System.out.println(String.join(" ", result));
    }
}

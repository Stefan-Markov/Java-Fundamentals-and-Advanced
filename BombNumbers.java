import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scan.nextLine().split("\\s+");

        int bombNumber = Integer.parseInt(input[0]);
        int bombPower = Integer.parseInt(input[1]);

        int sum = 0;

        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, bombIndex - bombPower);
            int right = Math.min(numbers.size() - 1, bombIndex + bombPower);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}

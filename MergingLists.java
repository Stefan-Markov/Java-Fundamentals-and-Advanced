import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> left = readList(scanner);

        List<Integer> right = readList(scanner);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < left.size() && i < right.size()) {
            result.add(left.get(i));
            result.add(right.get(i));

            i++;
        }

        // i ... size - 1
        if (i < left.size()) {
            result.addAll(getLeftovers(left, i));
        } else if (i < right.size()) {
            result.addAll(getLeftovers(right, i));
        }

        for (Integer number : result) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> getLeftovers(List<Integer> left, int afterIndex) {
        List<Integer> result = new ArrayList<>();

        for (int j = afterIndex; j < left.size(); j++) {
            result.add(left.get(j));
        }
        return result;
    }

    private static void addLeftovers(List<Integer> result,
                                     List<Integer> left, int afterIndex) {
        for (int j = afterIndex; j < left.size(); j++) {
            result.add(left.get(j));
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");

        // "3" "5" "7"
        // 3 5 7
        List<Integer> result =
                Arrays.stream(split)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        return result;
    }
}

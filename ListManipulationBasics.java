import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scan.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numberAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numberRemove);
                    break;
                case "RemoveAt":
                    int numberRemoveAt = Integer.parseInt(tokens[1]);
                    numbers.remove(numberRemoveAt);
                    break;
                case "Insert":
                    int numberInsert1 = Integer.parseInt(tokens[1]);
                    int numberInsert2 = Integer.parseInt(tokens[2]);
                    numbers.add(numberInsert2, numberInsert1);
                    break;
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

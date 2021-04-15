import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Add")) {
                int token = Integer.parseInt(tokens[1]);

                numbers.add(token);
            } else if (tokens[0].equals("Remove")) {
                int token = Integer.parseInt(tokens[1]);
                if (!(numbers.contains(token))) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(token);
                }
            } else if (tokens[0].equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                int num = Integer.parseInt(tokens[1]);

                if (index >= 0 && index > numbers.size()) {
                    System.out.println("Invalid index");
                    break;
                } else {
                    numbers.add(index, num);
                }
            } else if (tokens[0].equals("Shift")) {
                if ("left".equals(tokens[1])) {
                    int moveNum = Integer.parseInt(tokens[2]);
                    for (int i = 0; i < moveNum; i++) {
                        int temp = numbers.get(0);
                        for (int j = 0; j < numbers.size() - 1; j++) {

                            int nextElement = numbers.get(j + 1);
                            numbers.set(j, nextElement);
                        }
                        numbers.set(numbers.size() - 1, temp);
                    }
                } else {
                    int moveNum = Integer.parseInt(tokens[2]);
                    for (int i = 0; i < moveNum; i++) {

                        int temp = numbers.get(numbers.size() - 1);
                        for (int j = numbers.size() - 1; j > 0; j--) {

                            int nextNum = numbers.get(j - 1);
                            numbers.set(j, nextNum);
                        }
                        numbers.set(0, temp);
                    }
                }
            }
            input = scan.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

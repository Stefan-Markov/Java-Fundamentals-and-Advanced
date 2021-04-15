import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (true) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");

            if (line.equals("end")) {
                break;
            }

            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No such number");
                    }

                    break;
                case "Print":
                    if (tokens[1].contains("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if ((tokens[1].contains("odd"))) {
                        for (int j = 0; j < numbers.size(); j++) {
                            if (numbers.get(j) % 2 != 0) {

                                System.out.print(numbers.get(j) + " ");
                            }
                        }
                    }
                    break;
                case "Get":
                    for (int i = 0; i < numbers.size(); i++) {

                        sum += numbers.get(i);
                    }
                    System.out.println();
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(tokens[2]);

                    if (tokens[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
            }
        }
    }
}

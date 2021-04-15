import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = readList(scan);
        int wagonMax = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    int currentWagon = train.get(i);
                    int totalCnt = currentWagon + people;

                    if (totalCnt <= wagonMax) {
                        train.set(i, totalCnt);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        printTrain(train);
    }

    public static List<Integer> readList(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> outputList = new ArrayList<>();
        for (String element : input) {
            outputList.add(Integer.parseInt(element));
        }
        return outputList;
    }

    public static void printTrain(List<Integer> train) {
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }
}

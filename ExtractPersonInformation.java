import java.util.Scanner;

public class ExtractPersonInformation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int nameFirstIndex = 0;
        int nameSecondIndex = 0;

        int ageFirstIndex = 0;
        int ageSecondIndex = 0;

        for (int i = 0; i < number; i++) {
            String input = scan.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == '@') {
                    nameFirstIndex = (j);
                }
                if (symbol == '|') {
                    nameSecondIndex = j;
                }
                if (symbol == '#') {
                    ageFirstIndex = (j);
                }
                if (symbol == '*') {
                    ageSecondIndex = (j);
                }
            }
            String name = input.substring(nameFirstIndex + 1, nameSecondIndex);
            String age = input.substring(ageFirstIndex + 1, ageSecondIndex);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}

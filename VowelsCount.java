import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = readString(scanner);

        int finalResult = Search(name);
        System.out.println(finalResult);
    }

    public static String readString(Scanner scanner) {
        String nameOne = scanner.nextLine();
        return nameOne;
    }

    public static int Search(String name) {
        int counter = 0;

        for (int i = 0; i < name.length(); i++) {

            char word = name.charAt(i);

            switch (Character.toLowerCase(word)) {
                case 'a':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}

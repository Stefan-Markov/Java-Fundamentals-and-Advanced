import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ice
        //kicegiciceeb

        String pattern = scan.nextLine();
        String input = scan.nextLine();

        String newStr = "";
        while (!newStr.equals(input)) {

            newStr = input;
            input = input.replace(pattern, "");
        }
        System.out.println(input);
    }
}

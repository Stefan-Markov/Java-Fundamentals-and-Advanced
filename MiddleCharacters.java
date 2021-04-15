import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int index = input.length() / 2;
        
        if (input.length() % 2 == 0) {
            System.out.println(input.charAt(index - 1) + "" + input.charAt(index));
        } else {
            System.out.println(input.charAt(index));
        }
    }
}

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Set<String> guestList = new TreeSet<>();

        while (!input.equalsIgnoreCase("party")) {
            guestList.add(input.trim());
            input = scan.nextLine();
        }

        String inputGuest = scan.nextLine();
        while (!inputGuest.equalsIgnoreCase("END")) {
            guestList.remove(inputGuest);
            inputGuest = scan.nextLine();
        }

        System.out.println(guestList.size());
        for (String a : guestList) {
            System.out.println(a);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();

        int command = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < command; i++) {
            String[] tokens = scan.nextLine().split("\\s+", 2);

            String name = tokens[0];
            if (tokens[1].equals("is going!")) {
                if (guestList.contains(name)) {
                    System.out.println(String.format("%s is already in the list!", name));
                } else {
                    guestList.add(name);
                }
            } else {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.println(String.format("%s is not in the list!", name));
                }
            }
        }

        for (String n : guestList) {
            System.out.println(n);
        }
    }
}

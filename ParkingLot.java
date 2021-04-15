import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Set<String> parking = new LinkedHashSet<>();

        while (!input.equalsIgnoreCase("end")) {
            String[] split = input.split(", ");
            if (split[0].equalsIgnoreCase("in")) {
                parking.add(split[1]);
            } else if (split[0].equalsIgnoreCase("out")) {
                parking.remove(split[1]);
            }
            input = scan.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String a : parking) {
                System.out.println(a);
            }
        }
    }
}

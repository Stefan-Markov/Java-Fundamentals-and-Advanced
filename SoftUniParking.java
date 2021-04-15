import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String command = tokens[0];
            String userName = tokens[1];

            if ("register".equals(command)) {
                String number = tokens[2];

                if (parking.containsKey(userName)) {
                    String id = parking.get(userName);
                    System.out.println(String.format("ERROR: already registered with plate number %s", id));
                } else {
                    parking.put(userName, number);
                    System.out.println(String.format("%s registered %s successfully", userName, number));
                }
            } else {
                if (parking.containsKey(userName)) {
                    parking.remove(userName);
                    System.out.println(String.format("%s unregistered successfully", userName));
                } else {
                    System.out.println(String.format("ERROR: user %s not found", userName));
                }
            }
        }
        parking.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}

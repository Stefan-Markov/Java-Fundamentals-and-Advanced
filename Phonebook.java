import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("search")) {
            String[] tokens = input.split("-");

            String name = tokens[0];
            String phone = tokens[1];

            if (!phonebook.containsKey(phone)) {
                phonebook.putIfAbsent(name, phone);
            } else if (phonebook.containsKey(phone)) {
                phonebook.put(name, phone);
            }
            input = scan.nextLine();
        }
        String command = scan.nextLine();
        while (!command.equalsIgnoreCase("stop")) {
            if (phonebook.containsKey(command)) {
                System.out.println(command + " -> " + phonebook.get(command));
            } else if (!phonebook.containsKey(command)) {
                System.out.printf("Contact %s does not exist.%n", command);
            }
            command = scan.nextLine();
        }
    }
}

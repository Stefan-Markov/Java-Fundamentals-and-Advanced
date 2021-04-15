import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<String, ArrayList<String>> companies = new TreeMap<>();

        while (!"End".equals(input)) {

            String[] tokens = input.split(" -> ");

            String companyName = tokens[0];
            String employee = tokens[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
            }
            if (companies.containsKey(companyName) && !companies.get(companyName).contains(employee)) {
                companies.get(companyName).add(employee);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.println("-- " + ids);
            }
        }
    }
}

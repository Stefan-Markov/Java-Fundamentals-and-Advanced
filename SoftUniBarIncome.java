import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<product>[^<>]+)>(?:[^|$%.]*)\\|(?<qty>\\d+)\\|(?:[^|$%.]*?)(?<price>[-+]?\\d+\\.?\\d+)\\$";

        LinkedHashMap<String, Double> income = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0.0;
        String input = scan.nextLine();

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                Integer qty = Integer.parseInt(matcher.group("qty"));
                Double price = Double.parseDouble(matcher.group("price"));

                double sales = qty * price;
                StringBuilder sb = new StringBuilder();

                totalIncome += sales;
                sb.append(name);
                sb.append(": ");
                sb.append(product);

                income.put(sb.toString(), sales);
            }
            input = scan.nextLine();
        }
        income.forEach((key, value) -> System.out.printf("%s - %.2f%n", key, value));
        System.out.printf("Total income: %.2f", totalIncome);
    }
}

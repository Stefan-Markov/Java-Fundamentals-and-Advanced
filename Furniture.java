import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<furniture>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<qty>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);

        ArrayList<String> furniture = new ArrayList<>();

        double finalPrice = 0.0;

        String input = scan.nextLine();

        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String furn = matcher.group("furniture");
                String price = matcher.group("price");
                String qty = matcher.group("qty");

                double priceInt = Double.parseDouble(price);
                int qtyInt = Integer.parseInt(qty);

                furniture.add(furn);

                finalPrice += (qtyInt * priceInt);
            }
            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");

        furniture.forEach(System.out::println);
        System.out.println(String.format("Total money spend: %.2f", finalPrice));
    }
}

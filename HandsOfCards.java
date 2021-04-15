import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equalsIgnoreCase("joker")) {

            String[] tokens = input.split(":");

            String playerName = tokens[0];

            String[] info = tokens[1].trim().split(", ");

            players.putIfAbsent(playerName, new LinkedHashSet<>());

            for (int i = 0; i < info.length; i++) {
                players.get(playerName).add(info[i]);
            }

            input = scan.nextLine();
        }

        players.forEach((k, v) -> {
            System.out.print(k + ": ");

            int sum = 0;
            for (String values : v) {

                if (values.length() == 2) {
                    String[] tokens = values.split("");

                    int power = 0;

                    String powerString = tokens[0];
                    if (Character.isDigit(powerString.charAt(0))) {
                        power = Integer.parseInt(powerString);

                    } else if (!Character.isDigit(powerString.charAt(0))) {
                        switch (powerString) {
                            case "J":
                                power = 11;
                                break;
                            case "Q":
                                power = 12;
                                break;
                            case "K":
                                power = 13;
                                break;
                            case "A":
                                power = 14;
                                break;
                        }
                    }
                    String multiplier = tokens[1];

                    switch (multiplier) {
                        case "S":
                            int numS = 4;
                            sum += numS * power;
                            break;
                        case "H":
                            int numH = 3;
                            sum += numH * power;
                            break;
                        case "D":
                            int numD = 2;
                            sum += numD * power;
                            break;
                        case "C":
                            int numC = 1;
                            sum += numC * power;
                            break;
                    }
                } else if (values.length() == 3) {

                    String[] powerString = values.split("");

                    int power = Integer.parseInt(powerString[0] + powerString[1]);
                    char symbol = powerString[2].charAt(0);

                    switch (symbol) {
                        case 'S':
                            int numS = 4;
                            sum += numS * power;
                            break;
                        case 'H':
                            int numH = 3;
                            sum += numH * power;
                            break;
                        case 'D':
                            int numD = 2;
                            sum += numD * power;
                            break;
                        case 'C':
                            int numC = 1;
                            sum += numC * power;
                            break;
                    }
                }
            }
            System.out.println(sum);
        });
    }
}

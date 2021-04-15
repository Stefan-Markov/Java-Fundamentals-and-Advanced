import java.util.*;

public class UserLogs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> info = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("end")) {

            String[] tokens = input.split("=");
            String IP = tokens[1];
            String[] realIPaddress = IP.split(" ");

            String addressIP = realIPaddress[0];
            String user = tokens[3];
            if (!info.containsKey(user)) {
                info.put(user, new LinkedHashMap<>());
                info.get(user).put(addressIP, 1);
            } else if (info.containsKey(user) && info.get(user).containsKey(addressIP)) {
                int count = info.get(user).get(addressIP);
                info.get(user).put(addressIP, count + 1);
            } else if (info.containsKey(user) && !info.get(user).containsKey(addressIP)) {
                info.get(user).put(addressIP, 1);

            }
            input = scan.nextLine();
        }

        info.forEach((k, v) -> {
            System.out.printf("%s: %n", k);

            List<String> ipRow = new ArrayList<>();
            for (Map.Entry<String, Integer> a : v.entrySet()) {

                ipRow.add(a.getKey() + " => " + a.getValue());
            }

            if (ipRow.size() > 1) {
                for (int i = 0; i < ipRow.size() - 1; i++) {
                    System.out.print(ipRow.get(i) + ", ");
                }
                System.out.println(ipRow.get(ipRow.size() - 1) + ".");
            } else if (ipRow.size() == 1) {
                for (String s : ipRow) {
                    System.out.println(s + ".");
                }
            }
        });
    }
}


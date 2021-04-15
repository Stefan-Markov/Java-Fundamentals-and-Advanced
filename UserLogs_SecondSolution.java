import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_SecondSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = "";

        TreeMap<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        while (!(line = scan.nextLine()).equals("end")) {
            String[] tokens = line.split(" ");
            String ip = tokens[0].split("=")[1];
            String username = tokens[2].split("=")[1];

            if (!userLogs.containsKey(username)) {
                userLogs.put(username, new LinkedHashMap() {{
                    put(ip, 0);
                }});
            }
            if (!userLogs.get(username).containsKey(ip)) {
                userLogs.get(username).put(ip, 1);
            } else {
                if (userLogs.get(username).containsKey(ip)) {
                    int value = userLogs.get(username).get(ip) + 1;
                    userLogs.get(username).put(ip, value);
                }
            }
        }

        userLogs.forEach((k, v) -> {
            System.out.println(k + ": ");
            StringBuilder sb = new StringBuilder();
            v.forEach((key, value) -> {
                sb.append(String.format("%s => %d, ", key, value));
            });
            System.out.println(sb.toString().substring(0, sb.length() - 2) + ".");
        });
    }
}

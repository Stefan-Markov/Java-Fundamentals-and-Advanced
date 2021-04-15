import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        Map<String, Integer> addressTime = new LinkedHashMap<>();
        Map<String, List<String>> addressName = new TreeMap<>();

        for (int i = 0; i < num; i++) {

            String[] tokens = scan.nextLine().split(" ");

            String ipAddress = tokens[0];
            String name = tokens[1];
            int time = Integer.parseInt(tokens[2]);

            if (!addressTime.containsKey(name)) {

                addressTime.put(name, time);
            } else if (addressTime.containsKey(name)) {
                int oldTime = addressTime.get(name);
                addressTime.put(name, oldTime + time);
            }

            if (!addressName.containsKey(name)) {
                addressName.put(name, new ArrayList<>());
                addressName.get(name).add(ipAddress);

            } else if (addressName.containsKey(name) && !addressName.get(name).contains(ipAddress)) {
                addressName.get(name).add(ipAddress);
            }
        }

        addressName.forEach((k, v) -> {

            System.out.print(k + ": ");

            System.out.print(addressTime.get(k) + " ");

            StringBuilder address = new StringBuilder();
            address.append("[");

            List<String> ipList = new ArrayList<>(addressName.get(k));

            ipList.stream().sorted((s1, s2) -> s1.compareTo(s2))
                    .forEach(s ->
                    address.append(s).append(", "));
            address.append("]");
            address.deleteCharAt(address.length() - 2);
            address.deleteCharAt(address.length() - 2);
            System.out.println(address);
        });
    }
}

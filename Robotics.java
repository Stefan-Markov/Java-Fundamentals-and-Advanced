import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputRobot = scan.nextLine().split(";");
        Map<String, Integer> robots = splitRobotsData(inputRobot);

        String[] time = scan.nextLine().split(":");

        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        long totalTime = hours * 3600 + minutes * 60 + seconds;


        int[] processTime = new int[robots.size()];

        ArrayDeque<String> products = new ArrayDeque<>();

        String line = scan.nextLine();

        while (!line.equals("End")) {

            products.add(line);
            line = scan.nextLine();
        }

        while (!products.isEmpty()) {
            totalTime++;
            String current = products.poll();

            decreaseProcessTime(processTime);
            if (!assignJob(robots, processTime, current, totalTime)) {
                products.offer(current);
            }
        }
    }

    private static void decreaseProcessTime(int[] processTime) {
        for (int i = 0; i < processTime.length; i++) {
            if (processTime[i] > 0) {
                --processTime[i];
            }
        }
    }


    private static boolean assignJob(Map<String, Integer> robots, int[] processTime, String current, long totalTime) {
        for (int i = 0; i < processTime.length; i++) {
            if (processTime[i] == 0) {
                int count = 0;
                for (Map.Entry<String, Integer> product : robots.entrySet()) {
                    if (count == i) {
                        processTime[i] = product.getValue();
                        logJobAssigned(product.getKey(), current, totalTime);
                        return true;
                    }
                    count++;
                }
            }
        }
        return false;
    }

    private static void logJobAssigned(String name, String product, long totalTime) {

        long hours = (totalTime / 3600) % 24;
        long minutes = (totalTime % 3600) / 60;
        long seconds = totalTime % 60;

        System.out.println(String.format("%s - %s [%02d:%02d:%02d]", name, product, hours, minutes, seconds));
    }

    private static Map<String, Integer> splitRobotsData(String[] robotInput) {
        Map<String, Integer> robots = new LinkedHashMap<>();

        Arrays.stream(robotInput).forEach(line -> {
            int index = line.indexOf("-");
            String name = line.substring(0, index);
            int time = Integer.parseInt(line.substring(index + 1));
            robots.put(name, time);
        });
        return robots;
    }
}

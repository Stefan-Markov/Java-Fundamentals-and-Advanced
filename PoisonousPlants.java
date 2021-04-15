import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] plants = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] days = new int[n];

        ArrayDeque<Integer> freshPlants = new ArrayDeque<>();
        freshPlants.push(0);
        for (int i = 1; i < plants.length; i++) {
            int day = 0;
            while (!freshPlants.isEmpty() && plants[freshPlants.peek()] >= plants[i]) {
                day = Math.max(day, days[freshPlants.pop()]);
            }

            if (!freshPlants.isEmpty()) {
                days[i] = day + 1;
            }
            freshPlants.push(i);
        }
        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}

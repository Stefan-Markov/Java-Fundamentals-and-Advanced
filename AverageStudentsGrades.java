import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<Double>> grades = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");

            String student = input[0];
            Double grade = Double.parseDouble(input[1]);
            if (!grades.containsKey(student)) {

                grades.put(student, new ArrayList<>());
                grades.get(student).add(grade);
            } else if (grades.containsKey(student)) {

                grades.get(student).add(grade);
            }
        }

        System.out.println();

        grades.forEach((key, value) -> {
            double mid = 0;
            double size = value.size();

            System.out.print(key + " -> ");

            for (double a : value) {
                mid += a;
                System.out.printf("%.2f ", a);
            }

            double middle = mid / size;

            System.out.printf("(avg: %.2f)", middle);
            System.out.println();
        });
    }
}

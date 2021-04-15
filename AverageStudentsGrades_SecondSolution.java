import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades_SecondSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> studentsInfo = new TreeMap<>();

        while (n-- > 0) {
            String[] tokens = scan.nextLine().split(" ");
            String name = tokens[0];
            double grades = Double.parseDouble(tokens[1]);

            studentsInfo.putIfAbsent(name, new ArrayList<>());
            studentsInfo.get(name).add(grades);
        }
        for (Map.Entry<String, List<Double>> entry : studentsInfo.entrySet()) {
            System.out.println(String.format("%s -> %s (avg: %.2f)", entry.getKey(),
                    getGradesAsString(entry.getValue()), getAsAverage(entry.getValue())));
        }
    }

    private static Double getAsAverage(List<Double> value) {
        return value.stream()
                .mapToDouble(d -> d)
                .average().
                        orElse(0.00);
    }

    private static String getGradesAsString(List<Double> value) {

        return value.stream().map(grades -> String.format("%.2f", grades))
                .collect(Collectors.joining(" "));
    }
}

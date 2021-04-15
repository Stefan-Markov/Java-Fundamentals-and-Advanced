import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, ArrayList<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scan.nextLine();

            double grade = Double.parseDouble(scan.nextLine());

            students.putIfAbsent(name, new ArrayList<>());

            students.get(name).add(grade);
        }

        students.entrySet()
                .stream()
                .filter(s -> s
                        .getValue()
                        .stream()
                        .mapToDouble(Double::valueOf)
                        .average().getAsDouble() >= 4.50)
                .sorted((s1, s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double sec = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(sec, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue()
                                .stream().mapToDouble(Double::doubleValue).average().getAsDouble())));
    }
}

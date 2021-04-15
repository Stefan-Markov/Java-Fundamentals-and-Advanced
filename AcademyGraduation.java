import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Double[]> grades = new TreeMap<>();

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {

            String name = scan.nextLine();
            String[] scoresString = scan.nextLine().split(" ");
            Double[] scores = new Double[scoresString.length];

            for (int j = 0; j < scores.length; j++) {
                scores[j] = Double.parseDouble(scoresString[j]);

            }
            grades.put(name, scores);
        }

        System.out.println();

        grades.forEach((k, v) -> {

            double diff = 0;
            int counter = 0;
            double sum = 0;
            for (double a : v
            ) {
                counter++;
                sum += a;

            }
            diff = sum / counter;

            String diffStr = "" + diff;
            if (diffStr.lastIndexOf("0") == 0) {
                diffStr = diffStr.substring(diffStr.lastIndexOf("0"));
            }
            System.out.printf("%s is graduated with %s%n", k, diffStr);
        });
    }
}

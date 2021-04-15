import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printInWords(Double.parseDouble(scan.nextLine()));
    }

    public static void printInWords(double grade) {
        String gradeInWords = "";
        if (grade >= 2 && grade <= 2.99)
            gradeInWords = "Fail";

        if (grade >= 3 && grade <= 3.49)
            gradeInWords = "Poor";

        if (grade >= 3.50 && grade <= 4.49)
            gradeInWords = "Good";

        if (grade >= 4.50 && grade <= 5.49)
            gradeInWords = "Very good";

        if (grade >= 5.50 && grade <= 6)
            gradeInWords = "Excellent";

        System.out.println(gradeInWords);
    }
}

package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentsParts = input.split(" ");

            int age = Integer.parseInt(studentsParts[2]);
            Student student = new Student(studentsParts[0], studentsParts[1], age, studentsParts[3]);
            students.add(student);

            input = scan.nextLine();
        }

        String city = scan.nextLine();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getHometown().equals(city)) {
                printStudent(current);
            }
        }
    }

    public static void printStudent(Student current) {
        System.out.printf("%s %s is %d years old%n", current.getFirstName(),
                current.getLastName(),
                current.getAge());
    }
}

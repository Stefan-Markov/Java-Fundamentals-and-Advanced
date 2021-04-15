package CompanyRosterTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            Employee employee = new Employee();
            employee.setName(tokens[0]);
            employee.setSalary(Double.parseDouble(tokens[1]));
            employee.setPosition(tokens[2]);
            employee.setDepartment(tokens[3]);
            switch (tokens.length) {
                case 5:
                    if (tokens[4].contains("@")) {
                        employee.setEmail(tokens[4]);
                    } else {
                        employee.setAge(Integer.parseInt(tokens[4]));
                    }
                    break;
                case 6:
                    if (tokens[4].contains("@")) {
                        employee.setEmail(tokens[4]);
                        employee.setAge(Integer.parseInt(tokens[5]));
                    } else {
                        employee.setAge(Integer.parseInt(tokens[4]));
                        employee.setEmail(tokens[5]);
                    }
                    break;
            }
            employees.add(employee);
        }
        List<String> departmentsList = employees
                .stream()
                .map(Employee::getDepartment)
                .distinct().collect(Collectors.toList());
        List<Department> departments = new ArrayList<>();
        for (String depart : departmentsList) {
            departments.add(new Department(depart, employees
                    .stream()
                    .filter(employee -> employee.getDepartment()
                            .equals(depart))
                    .collect(Collectors.toList())));
        }
        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);
        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println(String.format("Highest Average Salary: %s", department.getName()));
        for (Employee employee : department.getEmployee()) {
            System.out.println(String.format("%s %.2f %s %d",
                    employee.getName(),
                    employee.getSalary(),
                    employee.getEmail(),
                    employee.getAge()));
        }
    }
}

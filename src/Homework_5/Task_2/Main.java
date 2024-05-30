package Homework_5.Task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        var alex = new Employee("Alex", 21, Department.IT, 1500);
        var mike = new Employee("Mike", 30, Department.HR, 1200);
        var kate = new Employee("Kate", 29, Department.Marketing, 1100);
        var john = new Employee("John", 43, Department.IT, 3000);
        var max = new Employee("Max", 33, Department.Finance, 1600);

        var employees = new ArrayList<>(List.of(alex, mike, kate, john, max));

        List<Employee> olderEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .toList();

        int countOfItEmployees = (int) employees.stream()
                .filter(employee -> employee.getDepartment() == Department.IT)
                .count();

        Optional<Employee> employeeWithMaxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        List<String> namesOfHrEmployees = employees.stream()
                .filter(employee -> employee.getDepartment() == Department.HR)
                .map(Employee::getName)
                .sorted()
                .toList();

        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        int middleSalary = totalSalary / employees.size();
    }
}

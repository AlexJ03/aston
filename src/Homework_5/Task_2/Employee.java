package Homework_5.Task_2;

public class Employee {
    private final String name;
    private final int age;
    private final Department department;
    private final int salary;

    public Employee(String name, int age, Department department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department=" + department + ", salary=" + salary + "}";
    }
}

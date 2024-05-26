package Homework_4.Task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        String[] subjects = {"Программирование", "Моделирование", "Проектирование баз данных"};

        int[] alexScores = {5, 3, 4};
        Student.Rating alexRating = new Student.Rating(subjects, alexScores);
        Student alex = new Student("Alex", "21ИП", 3, alexRating);

        int[] mikeScores = {3, 2, 0};
        Student.Rating mikeRating = new Student.Rating(subjects, mikeScores);
        Student mike = new Student("Mike", "21ИП", 3, mikeRating);

        students.add(alex);
        students.add(mike);

        // Печать всех студентов
        Student.printStudents(students, 3);

        // Отчисление студентов
        List<Student> newStudents = Student.expel(students);

        // Вывод студентов, продолжающих обучение
        Student.printStudents(newStudents, 3);
    }
}

package Homework_2.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();

        hobbies.add("Программировать");
        hobbies.add("Заниматься спортом");

        // Проверка на изменяемость ImmutablePerson
        ImmutablePerson immutablePerson = new ImmutablePerson("Alex", 20, hobbies);

        System.out.println(immutablePerson.getName());
        System.out.println(immutablePerson.getAge());
        System.out.println(immutablePerson.getHobbies());

        immutablePerson.getHobbies().add("Читать книги"); // UnsupportedOperationException

        System.out.println(immutablePerson.getHobbies());

        // Проверка на изменяемость MutablePerson
        MutablePerson mutablePerson = new MutablePerson("Alex", 20, hobbies);

        System.out.println(mutablePerson.getName());
        System.out.println(mutablePerson.getAge());
        System.out.println(mutablePerson.getHobbies());

        mutablePerson.getHobbies().add("Читать книги"); // Success

        System.out.println(mutablePerson.getHobbies());
    }
}

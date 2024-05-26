package Homework_4.Task_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        Person alex = new Person("Alex", 21);
        Person mike = new Person("Mike", 34);
        Person kate = new Person("Kate", 19);

        people.add(alex);
        people.add(mike);
        people.add(kate);

        for (Person person : people) {
            person.print();
        }

        people.remove(mike);
        people.remove(kate);

        boolean hasAlex = people.contains(alex);
    }
}

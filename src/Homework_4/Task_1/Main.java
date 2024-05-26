package Homework_4.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Россия");
        countries.add("Казахстан");
        countries.add("Беларусь");

        System.out.println(countries);

        countries.set(1, "Англия");

        countries.remove(1);

        countries.remove("Беларусь");

        int id = countries.indexOf("Россия");

        boolean hasRussia = countries.contains("Россия");
    }
}

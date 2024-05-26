package Homework_4.Task_2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();

        countries.addFirst("Россия");
        countries.addFirst("Беларусь");
        countries.addLast("Англия");
        countries.addLast("Испания");

        countries.removeFirst();
        countries.removeLast();

        String firstEl = countries.getFirst();
        String lastEl = countries.getLast();
    }
}

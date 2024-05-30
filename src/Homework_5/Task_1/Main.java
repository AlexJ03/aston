package Homework_5.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(0, 0, 0, 1, 5, 8, 3, 2, 3, 4, 5, 6, 7, 8, 9));

        int result = listOfNumbers.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .reduce(0, Integer::sum);
    }
}

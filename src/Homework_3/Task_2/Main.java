package Homework_3.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstLine = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondLine = scanner.nextLine();

        System.out.print("Введите третью строку: ");
        String thirdLine = scanner.nextLine();

        List<String> lines = new ArrayList<>();
        lines.add(firstLine);
        lines.add(thirdLine);

        List<String> shortestLines = compareLines(lines, secondLine);

        print(shortestLines);
    }

    public static List<String> compareLines(List<String> lines, String whatToCompareLines) {
        List<String> result = new ArrayList<>();

        for (String line : lines) {
            if (line.length() < whatToCompareLines.length()) {
                result.add(line);
            }
        }

        return result;
    }

    public static void print(List<String> lines) {
        String template = "Строка: %s; Длина: %d \n";

        System.out.println();
        for (String line : lines) {
            System.out.printf(template, line, line.length());
        }
    }
}

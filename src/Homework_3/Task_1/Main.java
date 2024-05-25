package Homework_3.Task_1;

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

        String shortestLine = getShortest(firstLine, secondLine, thirdLine);
        String longestLine = getLongest(firstLine, secondLine, thirdLine);

        print(shortestLine, longestLine);
    }

    public static String getShortest(String firstLine, String secondLine, String thirdLine) {
        String result = firstLine;

        if (result.length() > secondLine.length()) {
            result = secondLine;
        }

        if (result.length() > thirdLine.length()) {
            result = thirdLine;
        }

        return result;
    }

    public static String getLongest(String firstLine, String secondLine, String thirdLine) {
        String result = firstLine;

        if (result.length() < secondLine.length()) {
            result = secondLine;
        }

        if (result.length() < thirdLine.length()) {
            result = thirdLine;
        }

        return result;
    }

    public static void print(String shortestLine, String longestLine) {
        String template = "Самая короткая строка: %s; Длина: %d \nСамая длинная строка: %s; Длина: %d";
        System.out.println();
        System.out.printf(template, shortestLine, shortestLine.length(), longestLine, longestLine.length());
    }
}

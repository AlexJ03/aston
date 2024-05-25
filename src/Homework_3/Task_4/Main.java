package Homework_3.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        String result = duplicateEveryCharInLine(line);

        System.out.println();
        System.out.println("Результат: " + result);
    }

    public static String duplicateEveryCharInLine(String line) {
        String[] chars = line.split("");
        String result = "";

        for (String ch : chars) {
            result += ch;
            result += ch;
        }

        return result;
    }
}

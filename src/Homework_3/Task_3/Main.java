package Homework_3.Task_3;

import java.util.*;

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
        lines.add(secondLine);
        lines.add(thirdLine);

        String uniqueWord = getWordWithUniqueChars(lines);

        System.out.println();
        System.out.println("Результат: " + uniqueWord);
    }

    public static String getWordWithUniqueChars(List<String> lines) {
        for (String line : lines) {
            String[] words = getWordsFromLine(line);

            for (String word : words) {
                String[] chars = getCharsFromWord(word);

                if (isUnique(word, chars)) {
                    return word;
                }
            }
        }

        return " ";
    }

    public static String[] getWordsFromLine(String line) {
        return line.split(" ");
    }

    public static String[] getCharsFromWord(String word) {
        return word.split("");
    }

    public static boolean isUnique(String word, String[] chars) {
        Set<String> result = new LinkedHashSet<>();
        String resultWord = "";

        if (word.length() < 2) {
            return false;
        }

        for (String el : chars) {
            result.add(el);
        }

        for (String el : result) {
            resultWord += el;
        }

        return word.equals(resultWord);
    }
}

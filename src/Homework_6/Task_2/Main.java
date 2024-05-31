package Homework_6.Task_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("tms.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(' ', '_');
                System.out.println(modifiedLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

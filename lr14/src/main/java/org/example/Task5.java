package org.example;

import java.io.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        try (FileWriter writer = new FileWriter("f.txt")) {

            writer.write("5\n");
            writer.write("-15\n");
            writer.write("-20\n");
            writer.write("10\n");
            writer.write("-5\n");
            writer.write("-30\n");
            writer.write("25\n");
            writer.write("-11\n");
            writer.write("0\n");
            writer.write("8\n");

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }


        int count = 0;

        try (Scanner scanner = new Scanner(new File("f.txt"))) {

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < -10) {
                    count++;
                }
            }

            System.out.println("Количество чисел меньше -10: " + count);

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

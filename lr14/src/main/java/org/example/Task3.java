package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        try (FileWriter writer = new FileWriter("f.txt")) {

            for (int i = 0; i < 20; i++) {
                int number = random.nextInt(201) - 100;
                writer.write(number + "\n");
            }

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (
                Scanner scanner = new Scanner(new File("f.txt"));
                FileWriter writerG = new FileWriter("g.txt");
                FileWriter writerH = new FileWriter("h.txt")
        ) {

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 10 == 0) {
                    writerG.write(number + "\n");
                } else {
                    writerH.write(number + "\n");
                }
            }

            System.out.println("Числа распределены по файлам!");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Вывод содержимого файлов
        printFile("f.txt");
        printFile("g.txt");
        printFile("h.txt");
    }

    public static void printFile(String fileName) {
        System.out.println("\nФайл " + fileName + ":");

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                System.out.print(scanner.nextInt() + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

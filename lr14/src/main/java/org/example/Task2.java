package org.example;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("f.txt")) {

            System.out.println("Введите 10 целых чисел:");

            for (int i = 0; i < 10; i++) {
                int number = scanner.nextInt();
                writer.write(number + "\n");
            }

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int sum = 0;

        try (Scanner fileScanner = new Scanner(new File("f.txt"))) {

            System.out.println("Числа из файла:");

            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                System.out.print(number + " ");

                if (number < 0) {
                    sum += number;
                }
            }

            System.out.println("\nСумма отрицательных чисел: " + sum);

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

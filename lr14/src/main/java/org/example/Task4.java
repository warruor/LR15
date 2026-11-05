package org.example;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("time.txt")) {

            System.out.println("Введите 15 значений времени в секундах:");

            for (int i = 0; i < 15; i++) {
                double time = scanner.nextDouble();
                writer.write(time + "\n");
            }

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(new File("time.txt"))) {

            while (fileScanner.hasNextDouble()) {
                double time = fileScanner.nextDouble();
                sum += time;
                count++;
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("Среднее время: " + average + " секунд");
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

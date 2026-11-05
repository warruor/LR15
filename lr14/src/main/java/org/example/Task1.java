package org.example;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("game.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Моя любимая игра — Minecraft.\n");
            writer.write("Жанр: песочница.\n");
            writer.write("Разработчик: Mojang Studios.\n");
            writer.write("Год выпуска: 2011.\n");

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());


        try (FileReader reader = new FileReader(file)) {
            int symbol;

            System.out.println("\nСодержимое файла:");

            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

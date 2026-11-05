package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Professional[] professionals = new Professional[5];
        professionals[0] = new Doctor("Лиза", 10, 4.8, "Хирург");
        professionals[1] = new Doctor("Даша", 7, 4.9, "Терапевт");
        professionals[2] = new Doctor("Марта", 5, 4.7, "Кардиолог");
        professionals[3] = new Engineer("Леха", 8, 4.5, "Мост");
        professionals[4] = new Engineer("Лев", 6, 4.6, "Здание");

        for (int i = 0; i < professionals.length; i++) {
            System.out.println();
            professionals[i].displayInfo();
            professionals[i].work();
            System.out.println("Обязанности " + professionals[i].getResponsibilities());
        }


    }
}
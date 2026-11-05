package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


                    Actor actor = new Actor("Иван", 30, "Кино");
                    Singer singer = new Singer("Анна", 25, "Поп", "Сопрано");
                    Dancer dancer = new Dancer("Петр", 28, "Танцы", "Хип-хоп");

                    System.out.println("Перегрузка методов:");
                    actor.perform();
                    actor.perform("короля");
                    actor.perform(5);

                    singer.perform("Лето", 3);
                    dancer.perform("Хип-хоп", 4);

                    System.out.println();
                    System.out.println("Переопределение методов:");

                    Actor[] actors = new Actor[3];
                    actors[0] = actor;
                    actors[1] = singer;
                    actors[2] = dancer;

                    for (int i = 0; i < actors.length; i++) {
                        actors[i].displayInfo();
                        actors[i].perform();
                        System.out.println("Награды: " + actors[i].getAwards());
                        System.out.println();
                    }
    }
}
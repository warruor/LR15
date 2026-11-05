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


                    Buildable[] buildings = new Buildable[5];

                    buildings[0] = new ResidentialBuilding("Ленина 10", 9, 36);
                    buildings[1] = new ResidentialBuilding("Мира 15", 5, 20);
                    buildings[2] = new ResidentialBuilding("Пушкина 7", 12, 48);

                    buildings[3] = new OfficeBuilding("Центральная 1", 10, 8);
                    buildings[4] = new OfficeBuilding("Советская 5", 6, 5);

                    for (int i = 0; i < buildings.length; i++) {
                        System.out.println();

                        buildings[i].build();
                        System.out.println("Количество этажей: " + buildings[i].getFloors());

                        Habitable building = (Habitable) buildings[i];
                        building.live();

                        System.out.println("Вместимость: " + building.getCapacity() + " человек");
                    }
    }
}
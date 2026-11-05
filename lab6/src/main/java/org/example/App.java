package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер задания:");
            System.out.println("1 - лр6 класс ноутбук");
            System.out.println("2 - лр7 класс спортики");

            int choise = in.nextInt();

            switch (choise) {

                case 1:
                    Laptop laptop = new Laptop("Lenovo", 16, 512, 3000);

                    System.out.println("Ноутбук: " + laptop.getBrand());
                    System.out.println("ОЗУ: " + laptop.getRam() + " ГБ");
                    System.out.println("Память: " + laptop.getStorage() + " ГБ");
                    System.out.println("Цена до скидки: " + laptop.getPrice());
                    laptop.Skidka();
                    System.out.println("Цена после скидки: " + laptop.getPrice());
                    break;

                case 2:
                    Athlete[] athletes = new Athlete[5];
                    athletes[0] = new Athlete("Иван", "Футбол", 3);
                    athletes[1] = new Athlete("Анна", "Плавание", 5);
                    athletes[2] = new Athlete("Петр", "Баскетбол", 2);
                    athletes[3] = new Athlete("Мария", "Теннис", 4);
                    athletes[4] = new Athlete("Олег", "Легкая атлетика", 6);
                    System.out.println("Среднее число медалей: " + Athlete.srmedals());
                    break;

                default:
                    System.out.println("Кинец");
                    break;
            }
        }
    }
}

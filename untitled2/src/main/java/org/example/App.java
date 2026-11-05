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

                    Food[] foods = new Food[5];

                    foods[0] = new Pizza("Пепперони", 800, 20, "сыр, пепперони");
                    foods[1] = new Pizza("Маргарита", 700, 15, "сыр, помидоры");
                    foods[2] = new Pizza("Грибная", 750, 18, "сыр, грибы");

                    foods[3] = new Salad("Овощной", 300, 10, "майонез");
                    foods[4] = new Salad("Цезарь", 450, 15, "соус Цезарь");

                    for (int i = 0; i < foods.length; i++) {
                        System.out.println();
                        foods[i].displayInfo();
                        foods[i].cook();
                    }

                    Pizza pizza = (Pizza) foods[0];
                    pizza.addTopping("оливки");

                    Salad salad = (Salad) foods[3];
                    salad.addDressing("сметана");
            }
        }
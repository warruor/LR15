package org.example;

public class Pizza extends Food {

    private String toppings;

    public Pizza(String name, int calories, int cookingTime, String toppings) {
        super(name, calories, cookingTime);
        this.toppings = toppings;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public void cook() {

        System.out.println("Запекается в духовке");
    }

    public void addTopping(String topping) {
        toppings = toppings + ", " + topping;
        System.out.println("Добавлена начинка: " + topping);
    }
}
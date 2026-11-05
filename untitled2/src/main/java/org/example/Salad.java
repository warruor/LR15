package org.example;

public class Salad extends Food {

    private String dressing;

    public Salad(String name, int calories, int cookingTime, String dressing) {
        super(name, calories, cookingTime);
        this.dressing = dressing;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    @Override
    public void cook() {
        System.out.println("Нарезается и мешанькается");
    }

    public void addDressing(String dress) {
        dressing = dressing + ", " + dress;
        System.out.println("Добавлена заправка " + dress);
    }
}
package org.example;

public class Action extends Film {
    private int explosions;

    public Action(String title, int id, int duration, int explosions) {
        super(title, id, duration);
        this.explosions = explosions;
    }

    public int getExplosions() {
        return explosions;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество взрывов: " + explosions);
    }
}

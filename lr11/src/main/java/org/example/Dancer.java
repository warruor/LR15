package org.example;

public class Dancer extends Actor {

    private String danceStyle;

    public Dancer(String name, int age, String genre, String danceStyle) {
        super(name, age, genre);
        this.danceStyle = danceStyle;
    }

    @Override
    public String getAwards() {
        return "3 награды";
    }

    @Override
    public void perform() {
        System.out.println("Танцует на сцене");
    }

    public void perform(String danceStyle, int minutes) {
        System.out.println("Танцует " + danceStyle + " " + minutes + " минут");
    }
}
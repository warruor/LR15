package org.example;

public class Singer extends Actor {

    private String voice;

    public Singer(String name, int age, String genre, String voice) {
        super(name, age, genre);
        this.voice = voice;
    }

    @Override
    public String getAwards() {
        return "5 наград";
    }

    @Override
    public void perform() {
        System.out.println("Поет на сцене");
    }

    public void perform(String song, int minutes) {
        System.out.println("Поет песню " + song + " " + minutes + " минут");
    }
}
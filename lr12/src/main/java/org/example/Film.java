package org.example;

public class Film {
    private String title;
    private int id;
    private int duration;

    public Film(String title, int id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("ID: " + id);
        System.out.println("Длительность: " + duration + " мин.");
    }
}

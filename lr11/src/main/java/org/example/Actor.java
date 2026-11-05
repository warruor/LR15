package org.example;

public class Actor {

    protected String name;
    protected int age;
    protected String genre;

    public Actor(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public void perform() {
        System.out.println("Выступает");
    }

    public void perform(String role) {
        System.out.println("Играет роль " + role);
    }

    public void perform(int scenes) {
        System.out.println("Играет в " + scenes + " сценах");
    }

    public String getAwards() {
        return "Нет наград";
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Жанр: " + genre);
    }
}
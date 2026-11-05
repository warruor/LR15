package org.example;

public class Doctor extends Professional {

    private String specialization;

    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Оживляет и душу и тело");
    }

    @Override
    public String getResponsibilities() {
        return "Диагностика и лечение";
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя " + getName());
        System.out.println("Опыт " + getExperience() + " годиков");
        System.out.println("Рейт " + getRating());
        System.out.println("Специализация " + specialization);
    }
}
package org.example;

public class Engineer extends Professional {

    private String project;

    public Engineer(String name, int experience, double rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Создает важные штучки");
    }

    @Override
    public String getResponsibilities() {
        return "Проектирование и расчеты нейкия";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Проект " + project);
    }
}
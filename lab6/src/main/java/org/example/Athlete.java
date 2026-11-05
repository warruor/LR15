package org.example;

public class Athlete {

    private String name;
    private String sport;
    private int medals;

    static int vsegoAthletes = 0;
    static int vcegoMedals = 0;

    public Athlete(String name, String sport, int medals) {
        this.name = name;
        this.sport = sport;
        this.medals = medals;

        vsegoAthletes++;
        vcegoMedals += medals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    public static double srmedals() {
        return vcegoMedals / vsegoAthletes;
    }
}
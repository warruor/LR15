package org.example;


public class Hotel {
    private String name;
    private int stars;
    private double priceNight;

    public Hotel(String name, int stars, double pricePerNight) {
        this.name = name;
        this.stars = stars;
        this.priceNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(double priceNight) {
        this.priceNight = priceNight;
    }
}
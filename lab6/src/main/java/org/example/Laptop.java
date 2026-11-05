package org.example;

public class Laptop {

    private String brand;
    private int ram;
    private int storage;
    private double price;
    private int kol;

    public int getKol(){return kol;}
    public void setKol(int kol){this.kol=kol;}

    public Laptop (String brand, int ram, int storage, double price, int kol){
        this(brand, ram, storage, price);
        this.kol=kol;
    }
















































    public Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void Skidka() {
        price = price * 0.9;
    }
}
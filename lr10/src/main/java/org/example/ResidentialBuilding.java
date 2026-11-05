package org.example;

public class ResidentialBuilding implements Buildable, Habitable {

    private String address;
    private int floors;
    private int apartments;

    public ResidentialBuilding(String address, int floors, int apartments) {
        this.address = address;
        this.floors = floors;
        this.apartments = apartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public void build() {
        System.out.println("Строится жилой дом");
    }

    @Override
    public void live() {
        System.out.println("Жильцы заселились в квартиры");
    }

    @Override
    public int getCapacity() {
        return apartments * 3;
    }

    public void displayInfo() {
        System.out.println("Жилой дом");
        System.out.println("Адрес: " + address);
        System.out.println("Этажи: " + floors);
        System.out.println("Количество квартир: " + apartments);
        System.out.println("Вместимость: " + getCapacity() + " человек");
    }
}
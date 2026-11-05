package org.example;

public class OfficeBuilding implements Buildable, Habitable {

    private String address;
    private int floors;
    private int companies;

    public OfficeBuilding(String address, int floors, int companies) {
        this.address = address;
        this.floors = floors;
        this.companies = companies;
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

    public int getCompanies() {
        return companies;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }

    @Override
    public void build() {
        System.out.println("Строится офисное здание");
    }

    @Override
    public void live() {
        System.out.println("Сотрудники компаний заняли офисы");
    }

    @Override
    public int getCapacity() {
        return companies * 20;
    }

    public void displayInfo() {
        System.out.println("Офисное здание");
        System.out.println("Адрес: " + address);
        System.out.println("Этажи: " + floors);
        System.out.println("Количество компаний: " + companies);
        System.out.println("Вместимость: " + getCapacity() + " человек");
    }
}
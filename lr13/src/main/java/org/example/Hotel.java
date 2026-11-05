
package org.example;

public class Hotel {

    private String name;
    private String city;
    private int stars;
    private int rooms;
    private int availableRooms;

    public Hotel(String name, String city, int stars, int rooms)
            throws InvalidHotelDataException {

        setName(name);
        setCity(city);
        setStars(stars);
        setRooms(rooms);

        this.availableRooms = rooms;
    }



    public void setName(String name) throws InvalidHotelDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidHotelDataException(
                    "Название отеля не может быть пустым!"
            );
        }

        this.name = name;
    }

    public void setCity(String city) throws InvalidHotelDataException {
        if (city == null || city.trim().isEmpty()) {
            throw new InvalidHotelDataException(
                    "Город не может быть пустым!"
            );
        }

        this.city = city;
    }

    public void setStars(int stars) throws InvalidHotelDataException {
        if (stars < 1 || stars > 5) {
            throw new InvalidHotelDataException(
                    "Количество звезд должно быть от 1 до 5!"
            );
        }

        this.stars = stars;
    }

    public void setRooms(int rooms) throws InvalidHotelDataException {
        if (rooms <= 0) {
            throw new InvalidHotelDataException(
                    "Количество комнат должно быть больше 0!"
            );
        }

        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void bookRoom() throws RoomNotAvailableException {
        if (availableRooms <= 0) {
            throw new RoomNotAvailableException(
                    "В отеле " + name + " нет свободных комнат!"
            );
        }

        availableRooms--;

        System.out.println("Комната успешно забронирована в отеле " + name);
    }

    public void checkOut() {
        if (availableRooms >= rooms) {
            throw new IllegalStateException(
                    "В отеле " + name + " нет занятых комнат!"
            );
        }

        availableRooms++;

        System.out.println("Гость выселен из отеля " + name);
    }

    public void displayInfo() {
        System.out.println("Отель: " + name);
        System.out.println("Город: " + city);
        System.out.println("Звезды: " + stars);
        System.out.println("Всего комнат: " + rooms);
        System.out.println("Свободных комнат: " + availableRooms);
        System.out.println("--------------------------");
    }
}

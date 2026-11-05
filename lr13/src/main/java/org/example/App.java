package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static Hotel findHotel(List<Hotel> hotels, String name)
            throws HotelNotFoundException {

        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(name)) {
                return hotel;
            }
        }

        throw new HotelNotFoundException(
                "Отель " + name + " не найден!"
        );
    }

    public static void main(String[] args) {

        List<Hotel> hotels = new ArrayList<>();

        try {

            hotels.add(new Hotel("Hilton", "Minsk", 5, 3));
            hotels.add(new Hotel("Marriott", "Moscow", 4, 2));
            hotels.add(new Hotel("Sunrise", "Brest", 3, 1));

            System.out.println("Список отелей:");

            for (Hotel hotel : hotels) {
                hotel.displayInfo();
            }


            Hotel hotel = findHotel(hotels, "Hilton");


            System.out.println("Бронирование:");

            hotel.bookRoom();
            hotel.bookRoom();
            hotel.bookRoom();


            hotel.bookRoom();

        } catch (InvalidHotelDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());

        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());

        } catch (RoomNotAvailableException e) {
            System.out.println("Ошибка бронирования: " + e.getMessage());

        } finally {
            System.out.println("\nОперации завершены.");
        }

        try {
            Hotel hotel = findHotel(hotels, "Hilton");

            hotel.checkOut();
            hotel.displayInfo();

        } catch (HotelNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
package org.example;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                while (true) {
                    System.out.println("Введите номер задания:");
                    System.out.println("1 - Товар");
                    System.out.println("2 - Отель");
                    System.out.println("3 - Книга");


                    int choise = in.nextInt();

                    switch (choise) {

                        case 1:
                            Product product = new Product("Телефон", 1000.0, 2);

                            System.out.println("Общая стоимость: " + product.totalCost());
                            break;

                        case 2:
                            Hotel[] hotels = new Hotel[6];

                            hotels[0] = new Hotel("Минск", 3, 100);
                            hotels[1] = new Hotel("Виктория", 5, 250);
                            hotels[2] = new Hotel("Планета", 4, 150);
                            hotels[3] = new Hotel("Европа", 5, 300);
                            hotels[4] = new Hotel("Центральный", 3, 80);
                            hotels[5] = new Hotel("Беларусь", 4, 180);

                            Hotel maxStars = hotels[0];
                            Hotel many = hotels[0];

                            for (int i = 1; i < hotels.length; i++) {

                                if (hotels[i].getStars() > maxStars.getStars()) {
                                    maxStars = hotels[i];
                                }

                                if (hotels[i].getPriceNight() > many.getPriceNight()) {
                                    many = hotels[i];
                                }
                            }

                            System.out.println("Отель с макс кол звезд: " + maxStars.getName() + " - " + maxStars.getStars() + " звезд");
                            System.out.println("Самый дорогой отель: " + many.getName() + " - " + many.getPriceNight());
                            break;
                        case 3:
                            Book[] books = new Book[5];
                            books[0] = new Book("Гарри Поттер", Genre.FANTASY);
                            books[1] = new Book("Война и мир", Genre.HISTORY);
                            books[2] = new Book("Властелин колец", Genre.FANTASY);
                            books[3] = new Book("Наука с нами", Genre.SCIENCE);
                            books[4] = new Book("Гранатовый браслет", Genre.FICTION);
                            System.out.println("Книги жанра FANTASY:");
                            for (int i = 0; i < books.length; i++) {
                                if (books[i].getGenre() == Genre.FANTASY) {
                                    System.out.println(books[i].getTitle());
                                }
                            }
                            break;
                        default:
                            System.out.println("Неверный номер");
                            break;
                    }
                }
            }}
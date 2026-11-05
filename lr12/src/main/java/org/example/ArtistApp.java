package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArtistApp {

    public static void printArtists(List<Artist> artists, int rank) {
        for (Artist artist : artists) {
            if (artist.getRank() == rank) {
                artist.displayInfo();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        List<Artist> artists = new ArrayList<>();

        artists.add(new Artist(1, "Анна", "Поп", 2,
                Arrays.asList(5, 4, 5)));

        artists.add(new Artist(2, "Лиза", "Рок", 3,
                Arrays.asList(2, 3, 2)));

        artists.add(new Artist(3, "Света", "Джаз", 1,
                Arrays.asList(4, 5, 5)));

        artists.add(new Artist(4, "Кирилл", "Рок", 4,
                Arrays.asList(3, 3, 3)));

        artists.add(new Artist(5, "Даша", "Поп", 2,
                Arrays.asList(5, 5, 4)));

        artists.add(new Artist(6, "Никита", "Рэп", 3,
                Arrays.asList(1, 2, 2)));

        // 1. Удалить артистов со средним рейтингом < 3
        artists.removeIf(artist -> artist.getAverageRating() < 3);

        // 2. Повысить ранг артистов со средним рейтингом >= 4
        for (Artist artist : artists) {
            if (artist.getAverageRating() >= 4) {
                artist.setRank(artist.getRank() + 1);
            }
        }
        System.out.println("Артисты с рангом 3:");
        printArtists(artists, 3);


        artists.sort(
                Comparator.comparingDouble(Artist::getAverageRating)
                        .reversed()
                        .thenComparing(Artist::getName)
        );



        System.out.println("Артисты после сортировки:");

        for (Artist artist : artists) {
            System.out.println(
                    "ID: " + artist.getId()
                            + ", Имя: " + artist.getName()
                            + ", Средний рейтинг: "
                            + artist.getAverageRating()
            );
        }
    }
}

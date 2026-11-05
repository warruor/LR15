package org.example;

import java.util.List;

public class Artist {
    private int id;
    private String name;
    private String genre;
    private int rank;
    private List<Integer> fanRatings;

    public Artist(int id, String name, String genre,
                  int rank, List<Integer> fanRatings) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rank = rank;
        this.fanRatings = fanRatings;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public List<Integer> getFanRatings() {
        return fanRatings;
    }

    public double getAverageRating() {
        if (fanRatings == null || fanRatings.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int rating : fanRatings) {
            sum += rating;
        }

        return (double) sum / fanRatings.size();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Жанр: " + genre);
        System.out.println("Ранг: " + rank);
        System.out.println("Средний рейтинг: " + getAverageRating());
    }
}

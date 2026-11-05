package org.example;

public class Comedy extends Film {
    private int funnyRating;

    public Comedy(String title, int id, int duration, int funnyRating) {
        super(title, id, duration);
        this.funnyRating = funnyRating;
    }

    public int getFunnyRating() {
        return funnyRating;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Оценка юмора: " + funnyRating);
    }
}

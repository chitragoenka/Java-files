package com.example.Overloading.TvShow;

public class TvShow {
    private String name;
    private String mainCharacter;
    private int episodes;
    private String genre;
    private double rating;
    private boolean onNetflix;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow(String name, String mainCharacter, int episodes, String genre, double rating, boolean onNetflix) {
        this.name = name;
        this.mainCharacter = mainCharacter;
        this.episodes = episodes;
        this.genre = genre;
        this.rating = rating;
        this.onNetflix = onNetflix;
    }
    public String getName() {
        return this.name;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public double getRating() {
        return rating;
    }

    public boolean isOnNetflix() {
        return onNetflix;
    }
    public String toString() {
        return "The name of the show is " + this.name + " with " + this.episodes + " episodes. The genre is " + this.genre + ". \n" +
                this.mainCharacter + " plays the main character. The show has a rating of " + this.rating + ". \n" +
                "It is available to watch on Netflix: " + this.onNetflix;
    }
}

package com.example.LibraryManagementSystem;

//define DVD class that extends LibraryItem with 2 additional attributes
class DVD extends LibraryItem {
    private String director;
    private int duration;

    //constructor to initialize the attributes
    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    //Getters
    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    //override the abstract methods from LibraryItem class
    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle()  + ", Release Year: " + getReleaseYear() + ", Director: " + director + ", Duration: " + duration + " minutes";
    }
}

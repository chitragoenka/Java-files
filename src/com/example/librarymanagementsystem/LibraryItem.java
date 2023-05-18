package com.example.librarymanagementsystem;

abstract class LibraryItem { //Define the abstract class with attributes
    private String title;
    private int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
  // declare abstract methods
    public abstract String getItemType();

    public abstract String getItemDetails();

    //Getters
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

}

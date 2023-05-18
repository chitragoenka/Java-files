package com.example.objectsinlistspractice.Books;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

        public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }
    public String print(String s) {
        if (s.equalsIgnoreCase("everything")) {
            return getTitle() + " , " + getPages() + " , " + getYear();
        } else if (s.equalsIgnoreCase("names")) {
            return getTitle();
        } else return  "Enter either Everything or Names to get an output";
    }
}


package com.example.Overloading.Book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;
    private double rating;

    Book(String title, String author, int pages, int year, double rating) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.rating = rating;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getYear()
    {
        return this.year;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }
    public String toString() {
        return this.title + " was written by " + this.author + " in the year " + this.year + " and it has " + this.pages + " pages. \n" +
                "It has a rating of " + this.rating + ".";
    }
}

package com.example.librarymanagementsystem;

// define Book class that extends LibraryItem and adds additional attributes.
class Book extends LibraryItem {
    private String author;
    private String ISBN;

    //constructor to initialize the attributes
    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }
//Getters
    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    //overrides the abstract methods from LibraryItem class
    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Release Year: " + getReleaseYear() + ", Author: " + author + ", ISBN: " + ISBN;
    }

}

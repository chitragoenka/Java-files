package com.example.librarymanagementsystem;

//main class that demonstrates the functionality of the library management system
public class LibraryAppMain {
    public static void main(String[] args) {
        // Create objects of Book and DVD classes
        Book book1 = new Book("Java Programming", 2021, "John Doe", "1234567890");
        Book book2 = new Book("Python Basics", 2020, "Jane Smith", "0987654321");
        DVD dvd1 = new DVD("The Matrix", 1999, "Lana Wachowski", 136);
        DVD dvd2 = new DVD("Inception", 2010, "Christopher Nolan", 148);

        //create an instance of LibraryManager using generics to work with LibraryItem objects.

        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        //Add items
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);

        // Display the list of items in the library
        libraryManager.displayItems();

        //Remove items
        libraryManager.removeItem(book1);
        libraryManager.removeItem(dvd1);

        libraryManager.removeItem(dvd1); //prints item not found as it is already removed

        // Display the list of items in the library
        libraryManager.displayItems();

        // Remove all remaining items to get the display as "The library is empty".
        libraryManager.removeItem(book2);
        libraryManager.removeItem(dvd2);
        libraryManager.displayItems();
    }
}


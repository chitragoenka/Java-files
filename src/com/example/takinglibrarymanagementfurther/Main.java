package com.example.takinglibrarymanagementfurther;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Main {

    private List<Book> books;

    // Supplier that returns a new Book instance
    public Supplier<Book> createBook = () -> new Book("The Power of Now", "Eckhart Tolle", 1997, 236, "Non-Fiction");


  //   Consumer that prints a book's details
    public Consumer<Book> printBookDetails = (book) -> {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publish Date: " + book.getPublicationYear());
    };

    // Function that calculates the number of days between two dates
    public Function<String[], Long> calculateDaysBetween = (dates) -> {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        try {
            LocalDate date1 = LocalDate.parse(dates[0], dtf);
            LocalDate date2 = LocalDate.parse(dates[1], dtf);
            return ChronoUnit.DAYS.between(date1, date2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    };
    public static void main(String[] args) {
        Library library = new Library();


         Consumer<Book> printBookDetails = (book) -> {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publish Date: " + book.getPublicationYear());
        };

        // Adding books to the library
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 336, "Fiction");
        Book book2 = new Book("1984", "George Orwell", 1949, 328, "Fiction");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "Science");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813, 432, "Fiction");
        Book book5 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2014, 443, "History");
        Book book6 = new Book("The Power of Now", "Eckhart Tolle", 1997, 236, "Non-Fiction");
        Book book7 = new Book("A Brief History of Time", "Stephen Hawking", 1988, 256, "Non-Fiction");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        // Remove a book from the library by title.
        library.removeBookByTitle("A Brief History of Time");


        // Find books by year
        List<Book> booksByYear = library.findBooksByYear(1960);
        System.out.println("Books published in 1960:");
        for (Book book : booksByYear) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        // Find books by author
        List<Book> booksByAuthor = library.findBooksByAuthor("George Orwell");
        System.out.println("Books by George Orwell:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        // Find book with the most pages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("Book with the most pages: " + bookWithMostPages.getTitle());
        System.out.println();

        // Find books with more than n pages
        List<Book> booksWithMoreThan300Pages = library.findBooksByPages(300);
        System.out.println("Books with more than 300 pages:");
        for (Book book : booksWithMoreThan300Pages) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        // Print all book titles in the library, sorted alphabetically
        List<String> allBookTitles = library.getAllBookTitlesSorted();
        System.out.println("All book titles in the library (sorted alphabetically):");
        for (String title : allBookTitles) {
            System.out.println(title);
        }
        System.out.println();

        // Find books by category
        List<Book> booksInCategory = library.findBooksByCategory("Fiction");
        System.out.println("Books in the 'Fiction' category:");
        for (Book book : booksInCategory) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        // Loan and return a book
        library.loanBook("To Kill a Mockingbird");
        library.returnBook("To Kill a Mockingbird");

        // Create a user
        User user1 = new User("John Doe", "12345");
        user1.borrowBook(library, "1984");

        // Calculate late fees for the user
        library.calculateLateFees(user1);
    }
}

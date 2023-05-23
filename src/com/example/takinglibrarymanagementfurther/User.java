package com.example.takinglibrarymanagementfurther;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class User {
    private String name;
    private String libraryCardNumber;
    private List<Book> booksOnLoan;

    public User(String name, String libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(List<Book> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }

    public void borrowBook(Library library, String title) {
        Book book = library.findBookByTitle(title);
        if (book != null && !book.isOnLoan()) {
            book.setOnLoan(true);
            book.setDueDate(LocalDate.now().plusWeeks(2));
            booksOnLoan.add(book);
            System.out.println("Book '" + title + "' has been borrowed by " + name);
        } else {
            System.out.println("Book '" + title + "' is not available for borrowing.");
        }
    }

    public void returnBook(Library library, String title) {
        Book book = library.findBookByTitle(title);
        if (book != null && book.isOnLoan()) {
            book.setOnLoan(false);
            book.setDueDate(null);
            booksOnLoan.remove(book);
            System.out.println("Book '" + title + "' has been returned by " + name);
        } else {
            System.out.println("Book '" + title + "' is not currently on loan by " + name);
        }
    }

}

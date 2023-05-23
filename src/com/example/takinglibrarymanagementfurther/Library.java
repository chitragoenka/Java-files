package com.example.takinglibrarymanagementfurther;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Library {

    private List<Book> books;
    private List<Book> loanedBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.loanedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public List<Book> findBooksByYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> findBooksByPages(int pageCount) {
        return books.stream()
                .filter(book -> book.getPages() > pageCount)
                .collect(Collectors.toList());
    }

    public List<String> getAllBookTitlesSorted() {
        return books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void loanBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isOnLoan()) {
            book.setOnLoan(true);
            LocalDate dueDate = LocalDate.now().plusWeeks(2);
            book.setDueDate(dueDate);
            System.out.println("Book '" + title + "' has been loaned. Due date: " + dueDate);
        } else {
            System.out.println("Book '" + title + "' is not available for loan.");
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && book.isOnLoan()) {
            book.setOnLoan(false);
            book.setDueDate(null);
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' is not on loan.");
        }
    }

    public Book findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    private List<Book> filterBooks(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public void calculateLateFees(User user) {
        LocalDate today = LocalDate.now();
        List<Book> overdueBooks = user.getBooksOnLoan().stream()
                .filter(book -> book.getDueDate().isBefore(today))
                .collect(Collectors.toList());

        double totalLateFees = overdueBooks.stream()
                .mapToLong(book -> ChronoUnit.DAYS.between(book.getDueDate(), today))
                .mapToDouble(days -> days * 0.5) // Assuming late fee is $0.50 per day
                .sum();

        System.out.println("Late fees for user " + user.getName() + ": $" + totalLateFees);
    }
}

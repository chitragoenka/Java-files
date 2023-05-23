package com.example.secondpartoflibrarymanagement;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        //Create a library
        Library library = new Library();

        //Create books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 336);
        Book book2 = new Book("1984", "George Orwell", 1949, 328);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813, 432);
        Book book5 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2014, 443);

        //Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("Added books with the following titles: "+"\n"+book1.getTitle()+"\n"+book2.getTitle()+"\n"+book3.getTitle()+"\n"+book4.getTitle()+"\n"+book5.getTitle());
        System.out.println();

        //Remove book5
        System.out.println("Removing book: "+book5.getTitle());
        library.removeBookByTitle("Sapiens: A Brief History of Humankind");
        System.out.println();

        //Set category to books in library
        book1.setCategory("Fiction");
        book2.setCategory("Non-Fiction");
        book3.setCategory("Fiction");
        book4.setCategory("Non-Fiction");

        //Test findBooksPublishedInYear
        System.out.println("Books published in 1960: ");
        library.findBooksPublishedInYear(1960).forEach(System.out::println);

        //Test findBooksByAuthor
        System.out.println("Books by F. Scott Fitzgerald: ");
        library.findBooksByAuthor("F. Scott Fitzgerald").forEach(System.out::println);

        //Test findBookWithMostPages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("Book with the most pages: \n" + bookWithMostPages);
        System.out.println();

        //Test findBooksGreaterThanPages
        System.out.println("Books with more than 300 pages: ");
        library.findBooksGreaterThanPages(300).forEach(System.out::println);
        System.out.println();

        //Test getAllBookTitlesSortedAlphabetically
        System.out.println("All book titles sorted alphabetically: ");
        library.getAllBookTitlesSortedAlphabetically().forEach(System.out::println);
        System.out.println();

        //Test findBooksInCategory
        System.out.println("Fiction books: ");
        library.findBooksInCategory("Fiction").forEach(System.out::println);
        System.out.println();
        System.out.println("Non-Fiction books: ");
        library.findBooksInCategory("Non-Fiction").forEach(System.out::println);

        //Creates a user
        User user = new User("John Doe", "121212", library);

        //Test loanBook
        boolean loaned = library.loanBook(book3, user);
        System.out.println( user.getName()+" has "+ book3.title +" on loan: "+ loaned);
        System.out.println();

        //Test returnBook
        boolean returned = library.returnBook(book2, user);
        System.out.println(book2.title +" loan status: " + returned);
        System.out.println();

        //Test calculateLateFees
        book3.setLoanDate(LocalDate.now().minusWeeks(3));
        double lateFees = library.calculateLateFees(user);
        System.out.println(user.getName() +"\nLibrary card number: "+user.getLibraryCardNumber()+"\nBooks currently on loan: \n"+user.getBooksOnLoan()+"\nLate fees accrued: $" + lateFees);
        System.out.println();
    }
}

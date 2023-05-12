package com.example.Overloading.Book;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the book: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Who is the author of this book?");
            String author = scanner.nextLine();

            System.out.print("Enter the number of pages in the book: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What would you rate the book out of 10?");
            double rating = scanner.nextDouble();
            scanner.nextLine();

            Book book1 = new Book("The Catcher in the Rye", "J.D.Salinger", 224, 1951, 9.8);
            books.add(book1);

            Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 223, 1997, 9.9);
            books.add(book2);

            Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 193, 1979, 9.7);
            books.add(book3);

            Book book = new Book(title, author, pages, year, rating);
            books.add(book);
        }


        System.out.println("What information will be printed (everything/names)?");
        String choice = scanner.nextLine();

        if(choice.equals("names")) {
            for(Book book: books) {
                if(book != null) {
                    System.out.println(book.getTitle());
                }
            }
        } else if (choice.equals("everything")) {
            for (Book book: books) {
                if(book != null) {
                    System.out.println(book.toString());
                }
            }
        }

    }
}

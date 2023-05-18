package com.example.objectsinlistspractice.Books;

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

            System.out.print("Enter the number of pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Book book1 = new Book("The Catcher in the Rye", 224, 1951);
            books.add(book1);

            Book book2 = new Book("Harry Potter and the Philosopher's Stone", 223, 1997);
            books.add(book2);

            Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", 193, 1979);
            books.add(book3);

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed (everything/names)?");
        String printOption = scanner.nextLine();

        for (Book book:books){
            System.out.println(book.print(printOption));
        }
    }

}



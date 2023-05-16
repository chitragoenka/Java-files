package com.example.hashmappractice.printmeanotherhashmap;

import java.util.HashMap;

public class Program {
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(book.toString());
            }
        }
    }
}

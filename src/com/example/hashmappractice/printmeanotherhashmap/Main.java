package com.example.hashmappractice.printmeanotherhashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        Program.printValues(hashmap);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap, "prejud");
    }
}

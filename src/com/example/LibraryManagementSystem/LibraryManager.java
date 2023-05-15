package com.example.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

// This implements the LibraryOperations interface in the LibraryManager class.
// It maintains a list of items using a List<T> where T is a type parameter extending LibraryItem.
// The class provides implementations for the addItem(), removeItem(), and displayItems() methods.
class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added: " + item.getItemDetails());
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item removed: " + item.getItemDetails());
        } else {
            System.out.println("Item not found: " + item.getItemDetails());
        }
    }

    @Override
    public void displayItems() {

        if (items.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }

        System.out.println("Library items:");
        for (T item : items) {
            System.out.println(item.getItemType() + ": " + item.getItemDetails());
        }
    }
}


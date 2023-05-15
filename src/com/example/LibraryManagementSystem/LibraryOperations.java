package com.example.LibraryManagementSystem;

/* Define the LibraryOperations interface, which declares three methods: addItem(), removeItem(), and displayItems().
 It uses generics with a type parameter T that extends LibraryItem.
* */
interface LibraryOperations<T extends LibraryItem> {
    void addItem(T item);

    void removeItem(T item);

    void displayItems();
}


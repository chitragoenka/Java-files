package com.example.arraylistspractice;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or 0 to end): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Done entering integers into the list.");

        System.out.println("What number are you looking for in the list? ");
        int searchNumber = scanner.nextInt();

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchNumber) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            System.out.println(searchNumber + " is at index " + indexes.get(i));
        }
    }
}



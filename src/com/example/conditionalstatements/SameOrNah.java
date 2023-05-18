package com.example.conditionalstatements;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = scanner.nextLine().toLowerCase();

        System.out.println("Enter the second word: ");
        String secondWord = scanner.nextLine().toLowerCase();

        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}


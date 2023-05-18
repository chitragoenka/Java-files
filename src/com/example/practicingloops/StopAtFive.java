package com.example.practicingloops;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        while (number != 5) {
            System.out.println("Enter another number: ");
            number = scanner.nextInt();
        }
// Adding an exit statement
        System.out.println("You entered 5! Program stopping.");
    }
}


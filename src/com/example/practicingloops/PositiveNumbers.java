package com.example.practicingloops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number must be a positive number.");
            } else if (number > 0) {
                System.out.println("Number is " + number);
            }
        } while (number != 0);
    }
}


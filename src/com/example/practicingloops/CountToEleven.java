package com.example.practicingloops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number less than 11: ");
            number = scanner.nextInt();

            if (number < 0 || number >= 11) {
                System.out.println("Invalid input. Number must be between 0 and 10.");
            } else {
                for (int i = number; i <= 11; i++) {
                    System.out.println(i + " ");
                }
            }
        } while (number < 0 || number > 10);
    }
}


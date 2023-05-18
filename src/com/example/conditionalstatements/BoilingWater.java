package com.example.conditionalstatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        int temperature = scanner.nextInt();

        if (temperature >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling yet.");
        }
    }
}


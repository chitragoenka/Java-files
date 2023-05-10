package com.example.ArraysListsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();

        while (true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        if (strings.size() < 5) {
            System.out.println("You entered less than 5 items.");
        } else {
            System.out.println("The fifth item in the list is: " + strings.get(4));
        }

        scanner.close();
    }
}


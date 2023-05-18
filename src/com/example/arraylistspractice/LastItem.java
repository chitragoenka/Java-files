package com.example.arraylistspractice;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or an empty string to end): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        int size = strings.size();
        if (size > 0) {
            String lastItem = strings.get(size - 1);
            System.out.println("The last item in the list is: " + lastItem);
        } else {
            System.out.println("No strings were entered.");
        }
    }
}


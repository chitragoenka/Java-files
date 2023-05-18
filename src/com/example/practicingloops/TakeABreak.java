package com.example.practicingloops;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("yes")) {
            System.out.println("Do you want to take a break?");
            answer = scanner.nextLine();
        }
// Adding an exit statement when user enters yes
       System.out.println("Great! Enjoy your break!");
    }
}


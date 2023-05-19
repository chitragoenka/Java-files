package com.example.practicejavaproblems.logic1;

public class DateFashion {

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0; // No
        } else if (you >= 8 || date >= 8) {
            return 2; // Yes
        } else {
            return 1; // Maybe
        }
    }

    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(7, 2));
        System.out.println(dateFashion(5, 5));
        System.out.println(dateFashion(9, 2));
    }
}

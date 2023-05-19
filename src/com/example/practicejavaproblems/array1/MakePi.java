package com.example.practicejavaproblems.array1;

public class MakePi {

    public static int[] makePi() {
        int[] piDigits = {3, 1, 4};
        return piDigits;
    }

    public static void main(String[] args) {
        int[] piDigits = makePi();
        for (int digit : piDigits) {
            System.out.print(digit + " ");
        }
    }
}

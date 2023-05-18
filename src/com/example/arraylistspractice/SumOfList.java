package com.example.arraylistspractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or 0 to end): ");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.print(numbers.toString().replace("[","").replace("]","") + " were the items in the list. ");
        System.out.println("The sum of that list is:\n" + sumList(numbers));
    }

    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}


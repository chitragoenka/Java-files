package com.example.overloading.Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a counter with start value provided by the user
        System.out.print("Enter the start value for the counter: ");
        int startValue = scanner.nextInt();
        Counter counter = new Counter(startValue);

        System.out.println("Counter value: " + counter.value());

        // Increase the counter value
        counter.increase();
        System.out.println("Counter value after increase: " + counter.value());

        // Decrease the counter value
        counter.decrease();
        System.out.println("Counter value after decrease: " + counter.value());

        // Get input for the increase amount
        System.out.print("Enter the value to increase the counter by (Entering negative value does not change the counter): ");
        int increaseBy = scanner.nextInt();
        counter.increase(increaseBy);
        System.out.println("Counter value after overloaded increase: " + counter.value());

        // Get input for the decrease amount
        System.out.print("Enter the value to decrease the counter by (Entering negative value does not change the counter): ");
        int decreaseBy = scanner.nextInt();
        counter.decrease(decreaseBy);
        System.out.println("Counter value after overloaded decrease: " + counter.value());

        scanner.close();
    }
}


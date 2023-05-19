package com.example.practicejavaproblems.warmup1;

public class SumDouble {

    // Create sumDouble method takes two int parameters: a and b
    // It checks if a and b are equal using the condition a == b
    // If they are equal(same), the method returns double their sum by multiplying the sum of a and b by 2
    // If a and b are not equal, the method simply returns their sum.
    public static int sumDouble(int a, int b) {

            if (a == b) {
                return 2 * (a + b);
            } else {
                return a + b;
            }
        }
        public static void main(String[] args) {

        //Printing different case scenarios

        System.out.println("The sum of two different numbers, 1 and 2 is : " + sumDouble(1, 2));
        System.out.println("The sum of two different numbers, 3 and 2 is : " + sumDouble(3, 2));
        System.out.println("The sum of two same numbers, 2 and 2, is double their sum :  : " + sumDouble(2, 2));
    }

}

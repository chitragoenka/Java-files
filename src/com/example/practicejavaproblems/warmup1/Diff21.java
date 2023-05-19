package com.example.practicejavaproblems.warmup1;

public class Diff21 {

    // Create a method with an if-else statement that checks the value of n and determines the appropriate calculation to perform:
    //If n is less than or equal to 21 (n <= 21), the method returns the absolute difference between 21 and n
    //If n is greater than 21, the method returns double the difference between n and 21
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    public static void main(String[] args) {

        //Printing different case scenarios

        System.out.println("Difference when the number is 19(less than 21, absolute difference) : " + diff21(19));
        System.out.println("Difference when the number is 10(less than 21, absolute difference) : " + diff21(10));
        System.out.println("Difference when the number is exact 21 (absolute difference) : " + diff21(10));
        System.out.println("Difference when the number is 29(more than 21, double the difference) : " + diff21(29));
        System.out.println("Difference when the number is 25(more than 21, double the difference) : " + diff21(25));

    }
}

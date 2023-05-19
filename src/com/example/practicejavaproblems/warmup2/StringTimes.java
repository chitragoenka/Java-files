package com.example.practicejavaproblems.warmup2;

public class StringTimes {

    // Create method that takes two parameters,first String and second int
    // This method returns a larger string that is n copies of the original string
    // A String variable named result is initialized as an empty string
    // Then, a for loop is used to concatenate str to result n times.
    //During each iteration of the loop, str is added to the result string using the += operator
    //After the loop completes, the method returns the final value of result, which is the larger string that consists of n copies of str.

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result+=str;
        }
        return result;
    }

    // Printing different use cases
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("X", 5));
        System.out.println(stringTimes("5", 12));
        System.out.println(stringTimes("I like you!", 2));
    }

}

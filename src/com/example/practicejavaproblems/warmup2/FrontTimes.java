package com.example.practicejavaproblems.warmup2;

public class FrontTimes {

    // Create a method takes two parameters: a String and an int
    // This method returns a larger string that consists of n copies of the "front" part of the original string
    public static String frontTimes(String str, int n) {

        // An int variable is initialized with the value 3
        // This variable represents the length of the front part
        // If the length of str is less than frontLength, frontLength is updated to be equal to the length of str
        // This ensures that if str is shorter than 3 characters, the entire string is considered the front.

        int frontLength = 3;
        if (frontLength > str.length()) {
            frontLength = str.length();
        }

        // A String variable named front is assigned the substring of str from index 0 to frontLength, which represents the front part of the string.
        //A String variable named result is initialized as an empty string. Then, a for loop is used to concatenate front to result n times.
        //During each iteration of the loop, front is added to the result string using the + operator, which concatenates front to the existing value of result
        //After the loop completes, the method returns the final value of result, which is the larger string that consists of n copies of the front.

        String front = str.substring(0, frontLength);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }

    // Printing different scenarios
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }


}

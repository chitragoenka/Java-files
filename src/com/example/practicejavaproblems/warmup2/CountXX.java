package com.example.practicejavaproblems.warmup2;

public class CountXX {

    // Create a method that takes a String parameter and counts the number of occurrences of "xx" in that string.

    //In the method, an int variable named count is initialized to 0 to keep track of the count of "xx" occurrences.
    // A for loop is used to iterate over the characters of str, up to the second-to-last character.

    //During each iteration, a substring of length 2 starting from the current index i is extracted using the substring method
    // This substring is then compared to the string "xx" using the equals method
    // If the substring is equal to "xx", the count is incremented.

    //After the loop finishes, the method returns the final value of count, which represents the total number of occurrences of "xx"
   static int CountXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    // Printing different scenarios
    public static void main(String[] args) {
        System.out.println(CountXX("abcxx"));
        System.out.println(CountXX("xxx"));
        System.out.println(CountXX("Hello"));
        System.out.println(CountXX("abcxxxx"));
    }

}

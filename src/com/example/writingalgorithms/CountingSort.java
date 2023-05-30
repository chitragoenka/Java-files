package com.example.writingalgorithms;
// Given a string arr consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.
public class CountingSort {
    public static String countSort(String arr) {
        int n = arr.length();
        int[] count = new int[26]; // Count array to store the frequency of each letter

        // Count the frequency of each letter
        for (int i = 0; i < n; i++) {
            char c = arr.charAt(i);
            count[c - 'a']++;
        }

        StringBuilder sortedString = new StringBuilder();

        // Generate the sorted string based on the count array
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) ('a' + i));
                count[i]--;
            }
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        String arr = "edsab";
        String sortedString = countSort(arr);
        System.out.println("Sorted string: " + sortedString);
    }
}


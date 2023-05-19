package com.example.practicejavaproblems.string1;

public class MakeOutWord {

    //Create a method that takes two String parameters out and word and creates a new string with the word in the middle of the out string.

    //In the method, the starting substring of length 2 from the out string is extracted using the substring method and assigned to the variable start
    // The remaining substring from index 2 onwards is extracted and assigned to the variable end.

    //The new string is formed by concatenating start, word, and end using the + operator.

    //The final string with the word in the middle is then returned by the method.
    public static String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2);
        return start + word + end;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}

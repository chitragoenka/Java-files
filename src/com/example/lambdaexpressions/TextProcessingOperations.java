package com.example.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class TextProcessingOperations {
    public static void main(String[] args) {
        String textData = "Hello, how are you?\nI'm doing good, thank you.\nThis week we are covering Lambda Expressions and Streams in Java.\nIt seems challenging to me.";

      try {

          // Count the number of lines in the text data
          long lineCount = countLines(textData);
          System.out.println("Number of lines: " + lineCount);

          // Count the number of words in the text data
          long wordCount = countWords(textData);
          System.out.println("Number of words: " + wordCount);

          // Find the longest word in the text data
          String longestWord = findLongestWord(textData);
          System.out.println("Longest word: " + longestWord);

          // Sort the words in alphabetical order
          String sortedWords = sortWords(textData);
          System.out.println("Sorted words: " + sortedWords);
      } catch (Exception e) {
          System.out.println("An error occurred: " + e.getMessage());
      }

      }


    //This method calls textData.lines() on the textData string
    // The lines() method splits the text data into lines and returns a Stream<String> where each element represents a line

    //The count method is called on the stream of lines. It returns the total number of lines in the stream as a long value.
    public static long countLines(String textData) {
        try {
            return textData.lines().count();
        } catch (Exception e) {
            throw new RuntimeException("Error counting lines: " + e.getMessage(), e);
        }
    }

    //The flatMap operation processes each line, takes a lambda expression line as an argument, splits the line into individual words using whitespace as the delimiter
    // Arrays.stream converts the resulting array of words into a Stream<String>.

    //The flatMap operation flattens the stream of streams into a single stream of words, ensuring all words from each line are combined into a single stream

    //The filter operation uses the Predicate.not(String::isBlank) method reference to filter out any blank or empty strings from the stream of words
    // String::isBlank is a method reference to the isBlank method in the String class, which returns true if a string is empty or contains only whitespace

    //Finally, the count operation is called on the stream of words, returns the total number of words in the stream as a long value
    public static long countWords(String textData) {
        try {
            return textData.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(Predicate.not(String::isBlank))
                    .count();
        } catch (Exception e) {
            throw new RuntimeException("Error counting words: " + e.getMessage(), e);
        }
    }


    //The flatMap operation flattens the stream of streams into a single stream of words

    //The filter operation uses the Predicate.not(String::isBlank) method reference to filter out any blank or empty strings

    //The max operation takes a comparator Comparator.comparingInt(String::length) as an argument, compares the length of each word and selects the word with the maximum length

    //Finally, the orElse("") method checks if the stream is empty or no longest word is found, it returns an empty string "" as the default value.

    public static String findLongestWord(String textData) {
        try {
            return textData.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(Predicate.not(String::isBlank))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");
        } catch (Exception e) {
            throw new RuntimeException("Error finding the longest word: " + e.getMessage(), e);
        }
    }

    //The distinct operation removes any duplicate words from the stream

    //The sorted operation is applied to sort the words in alphabetical order.

    //Finally, the reduce operation is used to concatenate the sorted words into a single string
    public static String sortWords(String textData) {
        try {
            return textData.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(Predicate.not(String::isBlank))
                    .distinct()
                    .sorted()
                    .reduce("", (result, word) -> result.isEmpty() ? word : result + " " + word);
        } catch (Exception e) {
            throw new RuntimeException("Error sorting words: " + e.getMessage(), e);
        }
    }
}

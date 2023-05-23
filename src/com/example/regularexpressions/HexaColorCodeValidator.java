package com.example.regularexpressions;

import java.util.regex.*;

public class HexaColorCodeValidator {
    public static void main(String[] args) {

        //Valid

        String colorCode = "#1aB3f5";
        String pattern = "^#([0-9a-fA-F]{6})$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(colorCode);

        // Check if the color code matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid hexadecimal color code");
        } else {
            System.out.println("Invalid hexadecimal color code");
        }

        //Invalid

        String colorCode2 = "123#1aB3f5";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(colorCode2);

        // Check if the color code matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid hexadecimal color code");
        } else {
            System.out.println("Invalid hexadecimal color code");
        }
    }
}


package com.example.regularexpressions;

import java.util.regex.*;

public class ZipcodeValidator {
    public static void main(String[] args) {
        String zipCode = "12345-6789";
        String pattern = "^\\d{5}(-\\d{4})?$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(zipCode);

        // Check if the zip code matches the pattern
        if (matcher.matches() && zipCode.length() == 5 || zipCode.length() == 10) {
            System.out.println("Valid US zip code");
        } else {
            System.out.println("Invalid US zip code");
        }

        //Invalid

        String zipCode2 = "12334545-678923";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(zipCode2);

        // Check if the zip code matches the pattern
        if (matcher2.matches() && zipCode2.length() == 5 || zipCode2.length() == 10) {
            System.out.println("Valid US zip code");
        } else {
            System.out.println("Invalid US zip code");
        }
    }
}


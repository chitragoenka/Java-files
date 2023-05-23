package com.example.regularexpressions;

import java.util.regex.*;

public class PhoneNumberValidator {
    public static void main(String[] args) {

        //Valid no.
        String phoneNumber = "(123) 456-7890";
        String pattern = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(phoneNumber);

        // Check if the phone number matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }

        //Invalid no.

        String phoneNumber2 = "(abc) 456-7890";


        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(phoneNumber2);

        // Check if the phone number matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}


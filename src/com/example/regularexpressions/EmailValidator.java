package com.example.regularexpressions;

import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {

        //Valid email
        String email1 = "test@example.com";
        String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(email1);


        // Check if the email matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }

        //Invalid email
        String email2 = "helloworld.com";
        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(email2);

        // Check if the email matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}


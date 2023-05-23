package com.example.regularexpressions;

import java.util.regex.*;

public class DateValidator {
    public static void main(String[] args) {

        //Valid date
        String date = "12/31/2023";
        String pattern = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2[0-9]|3[01])/\\d{4}$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(date);

        // Check if the date matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }

        //Invalid date

        String date2 = "14/33/2023";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(date2);

        // Check if the date matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }

    }
}


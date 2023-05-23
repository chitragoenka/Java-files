package com.example.regularexpressions;

import java.util.regex.*;

public class TimeValidator {
    public static void main(String[] args) {
        //Valid

        String time = "17:30";
        String pattern = "^([01]\\d|2[0-3]):([0-5]\\d)$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(time);

        // Check if the time matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid time in the 24-hour format");
        } else {
            System.out.println("Invalid time in the 24-hour format");
        }

        //Invalid

        String time2 = "30:90";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(time2);

        // Check if the time matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid time in the 24-hour format");
        } else {
            System.out.println("Invalid time in the 24-hour format");
        }
    }
}

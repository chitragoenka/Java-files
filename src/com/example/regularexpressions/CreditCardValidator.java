package com.example.regularexpressions;

import java.util.regex.*;

public class CreditCardValidator {
    public static void main(String[] args) {

        //Valid credit card

        String creditCardNumber = "1234-5678-9012-3456";
        String pattern = "^(\\d{4}[ -]?){3}\\d{4}$";

        // Remove dashes or spaces from the credit card number
        String sanitizedNumber = creditCardNumber.replaceAll("[ -]", "");

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(sanitizedNumber);

        // Check if the credit card number matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }

        String creditCardNumber2 = "1245634-5abc678-9012-3456";

        // Remove dashes or spaces from the credit card number
        String sanitizedNumber2 = creditCardNumber2.replaceAll("[ -]", "");

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(sanitizedNumber2);

        // Check if the credit card number matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }
    }
}


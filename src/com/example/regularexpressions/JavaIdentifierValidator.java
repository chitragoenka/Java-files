package com.example.regularexpressions;

import java.util.regex.*;

public class JavaIdentifierValidator {
    public static void main(String[] args) {
        //Valid

        String identifier = "_myIdentifier123";
        String pattern = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(identifier);

        // Check if the identifier matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid Java identifier");
        } else {
            System.out.println("Invalid Java identifier");
        }

        //Invalid
        String identifier2 = "123_myIdentifier123";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(identifier2);

        // Check if the identifier matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid Java identifier");
        } else {
            System.out.println("Invalid Java identifier");
        }
    }
}


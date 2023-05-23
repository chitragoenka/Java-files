package com.example.regularexpressions;

import java.util.regex.*;

public class URLValidator {
    public static void main(String[] args) {
        //Valid url

        String url = "https://www.example.com";
        String pattern = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/\\S*)?$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(url);

        // Check if the URL matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }

        //Invalid url

        String url2 = "htxyzps://www.example.com";

        // Create a Pattern object
        Pattern regex2 = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher2 = regex2.matcher(url2);

        // Check if the URL matches the pattern
        if (matcher2.matches()) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }
}


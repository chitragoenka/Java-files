package com.example.hashmappractice.abbreviations;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        System.out.println(abbreviations.hasAbbreviation("e.a")); // false
        System.out.println(abbreviations.hasAbbreviation("e.g."));  // true


        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

        System.out.println(abbreviations.findExplanationFor("e.g.")); // will return for example
        System.out.println(abbreviations.findExplanationFor("e.a.")); // will return null
    }
}



package com.example.hashmappractice.abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsMap;

    // The class must have a constructor, which does not take any parameters
    public Abbreviations() {
        abbreviationsMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationsMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationsMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationsMap.get(abbreviation);
    }
}


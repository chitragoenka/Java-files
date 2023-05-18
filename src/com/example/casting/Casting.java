package com.example.casting;

public class Casting {
    public static void main(String[] args) {
        double myDouble = 112.35;
        int myInt = (int) myDouble; //explicit casting from double to int
        System.out.println("Double: " + myDouble);
        System.out.println("int: " + myInt);

        String myString = "49";
        int myParsedInt = Integer.parseInt(myString); //explicit parsing from string to int
        System.out.println("The string value is: " + myString);
        System.out.println("The integer value is: " + myParsedInt);
    }
}

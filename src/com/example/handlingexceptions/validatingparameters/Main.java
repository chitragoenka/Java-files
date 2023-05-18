package com.example.handlingexceptions.validatingparameters;

public class Main {
    public static void main(String[] args) {
        try {
            // When the input is valid

            Person person1 = new Person("John", 25);
            System.out.println("Valid person created: " + person1.getName());

            // When the input is invalid(empty)

            Person person2 = new Person("", 30);
            System.out.println("This line will not be executed");

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating person: " + e.getMessage());
            System.out.println();
        }

        try {
            // Valid calculation
            int factorialResult1 = Calculator.factorial(5);
            System.out.println("Factorial result: " + factorialResult1);

            // Invalid calculation (negative number)
            int factorialResult2 = Calculator.factorial(-3);
            System.out.println("This line will not be executed");

        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating factorial: " + e.getMessage());
            System.out.println();
        }

        try {
            // Valid calculation
            int binomialCoefficientResult1 = Calculator.binomialCoefficient(6, 3);
            System.out.println("Binomial coefficient result: " + binomialCoefficientResult1);

            // Invalid calculation (subset size exceeds set size)
            int binomialCoefficientResult2 = Calculator.binomialCoefficient(4, 5);
            System.out.println("This line will not be executed");

        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating binomial coefficient: " + e.getMessage());
        }
    }
}

package com.example.handlingexceptions.validatingparameters;

public class Calculator {
       public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

           int factorialResult = 1;
           for (int i = 2; i <= number; i++) {
               factorialResult *= i;
           }

        return factorialResult;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {

        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
            throw new IllegalArgumentException("Invalid parameters");
        }

        // only works when the parameters are non-negative and subset size does not exceed set size
        int binomialCoefficientResult = factorial(setSize) / (factorial(subsetSize) * factorial(setSize - subsetSize));

        return binomialCoefficientResult;
    }


}

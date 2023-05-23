package com.example.javalambdaexpressions;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        // Addition
        Operation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(6, 3));

        // Subtraction
        Operation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(6, 3));

        // Multiplication
        Operation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(6, 3));

        // Division
        Operation division = (a, b) -> a / b;
        System.out.println("Division: " + division.operate(6, 3));
    }
}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}
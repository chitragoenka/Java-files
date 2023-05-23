package com.example.javalambdaexpressions;

public class LambdaFunctionalInterfaces {
    public static void main(String[] args) {
        // Custom functional interfaces

        MyInterface add = (a, b) -> a + b; //Addition
        System.out.println("Addition Result: " + add.operation(6, 3));

        MyInterface subtract = (a, b) -> a - b; //Subtraction
        System.out.println("Subtraction Result: " + subtract.operation(6, 3));

        MyInterface multiply = (a, b) -> a * b; //Multiplication
        System.out.println("Multiplication Result: " + multiply.operation(6, 3));

        MyInterface divide = (a, b) -> a / b; //Division
        System.out.println("Division Result: " + divide.operation(6, 3));
    }
}

@FunctionalInterface
interface MyInterface {
    int operation(int a, int b);
}


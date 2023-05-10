package com.example.PracticingMethods;

import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b; //Assigning int data types to 2 variables

        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        double c = divide(a, b); // Assigning double data type to a variable

        System.out.println(a + "/" + b + " = " + c);
    }
    public static double divide(int a, int b) {
        double result = (double) a / b;
        return result;
    }
}


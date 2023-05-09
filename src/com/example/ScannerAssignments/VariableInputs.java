package com.example.ScannerAssignments;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String strInput = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int intInput = scanner.nextInt();
        System.out.println("Enter a double: ");
        double doubleInput = scanner.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean booleanInput = scanner.nextBoolean();
        System.out.println("Your string is " + strInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);
    }
}


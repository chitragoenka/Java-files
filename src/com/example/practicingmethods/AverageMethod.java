package com.example.practicingmethods;

public class AverageMethod {
    public static void main(String[] args) {
        double avg = average(2, 5, 8);
        System.out.println("Average of 2, 5, and 8 is " + avg);
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int num1, int num2, int num3) {
        int total = sum(num1, num2, num3);
        return (double) total / 3;
    }
}

// Testing code when the user can give the number inputs (successful)

//import java.util.Scanner;
//
//public class AverageMethod {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//        System.out.print("Enter third number: ");
//        int num3 = input.nextInt();
//        double avg = average(num1, num2, num3);
//        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg);
//        input.close();
//    }
//
//    public static int sum(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }
//
//    public static double average(int num1, int num2, int num3) {
//        int total = sum(num1, num2, num3);
//        return (double) total / 3;
//    }
//}

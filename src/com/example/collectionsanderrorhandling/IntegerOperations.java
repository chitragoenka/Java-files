package com.example.collectionsanderrorhandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerOperations {

    public static void main(String[] args) {

        //Define a list of integers with duplicates
        List<Integer> integers = new ArrayList<>();

        integers.add(5);
        integers.add(10);
        integers.add(15);
        integers.add(10); //Duplicate integer
        integers.add(20);
        integers.add(20); //Duplicate integer


        try {

            // Using Set to remove duplicates

            Set<Integer> uniqueIntegers = new HashSet<>(integers);

            //Printing
            System.out.println("List of original integers with duplicates: " + integers);
            System.out.println("List of integers without duplicates: " + uniqueIntegers);

            //Calling calculate sum and average methods

            int sum = calculateSum(uniqueIntegers);
            double average = calculateAverage(uniqueIntegers);

            //Printing
            System.out.println("Sum of the integers without duplicates: " + sum);
            System.out.println("Average of the integers without duplicates: " + average);

            // Simulating exceptions

            int invalidIndex = integers.get(integers.size()); // IndexOutOfBoundsException.This line tries to access an element from the integers list using an invalid index. Since the index is equal to the size of the list, it is out of bounds and will throw an IndexOutOfBoundsException.
            int dividedByZero = sum / 0; // ArithmeticException
            int negativeSize = -1;
            if (negativeSize < 0) {
                throw new IllegalArgumentException("List size cannot be negative."); // IllegalArgumentException
            }

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds exception occurred: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument exception occurred: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.err.println("Arithmetic exception occurred: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("An unexpected exception occurred: " + e.getMessage());

        } finally {
            System.out.println("Program execution completed.");
        }
    }

    // sum and average calculation methods
    private static int calculateSum(Set<Integer> integers) {
        int sum = 0;

        if (integers == null) {
            throw new IllegalArgumentException("Input Set cannot be null.");
        }
        for (int num : integers) {
            sum += num;
        }
        return sum;
    }

    private static double calculateAverage(Set<Integer> integers) {
        if (integers.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty Set.");
        }
        int sum = calculateSum(integers);
        return (double) sum / integers.size();

    }

}






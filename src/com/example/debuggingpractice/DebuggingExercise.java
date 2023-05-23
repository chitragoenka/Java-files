package com.example.debuggingpractice;

public class DebuggingExercise {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);


        // Using "System.out.println()" statements to find and fix the problem.

        // Introduce a null pointer exception
        numbers = null;
        try {
            average = calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        // Introduce an array index out of bounds exception
        numbers = new int[3];
        try {
            average = calculateAverage(numbers);
            System.out.println("Average: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        // Introduce a logic error
        numbers = new int[]{1, 2, 3, 4, 6};
        average = calculateAverage(numbers);
        System.out.println("Incorrect Average: " + average);

        //Using a debugger to find and fix problems
        // EVERYTHING IS COMMENTED OUT (PLEASE DO CHECK)


        // Null Pointer Exception:
        //To introduce a null pointer exception, I passed a null array to the calculateAverage method
        // Modified the main method as follows:

        // public static void main(String[] args) {
        //    int[] numbers = null;
        //    double average = calculateAverage(numbers);
        //    System.out.println("Average: " + average);
        //}

//    When executing this code, it threw a NullPointerException at the line where the method tries to access numbers.length.

//    To fix this issue, we need to check if the array is null before accessing its length. We can add an if statement at the beginning of the calculateAverage method:

//    public static double calculateAverage(int[] numbers) {
//        if (numbers == null || numbers.length == 0) {
//            return 0.0;
//        }
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        return sum / numbers.length;
//    }
        // Now, if the array is null or empty, the method will return 0.0 instead of causing a null pointer exception.


//    Array Index Out of Bounds Exception:
//    To introduce an array index out of bounds exception,I modified the calculateAverage method to iterate up to numbers.length + 1
//    Updated the for loop condition in the method:

// for (int i = 0; i <= numbers.length; i++) {
//        sum += numbers[i];
//    }

        //When executing this code, it threw an ArrayIndexOutOfBoundsException at the line inside the loop.

        //To fix this issue,I changed the loop condition to i < numbers.length (without the equal sign) since array indices are zero-based:

        //for (int i = 0; i < numbers.length; i++) {
        //    sum += numbers[i];
        //}
        //This will ensure that the loop iterates over valid indices of the array.

        //Logic Error:
        //To introduce a logic error, I modified the calculateAverage method to return an incorrect average by dividing the sum by numbers.length + 1
        // Modified the return statement in the method:

        //return sum / (numbers.length + 1);
        //When executing this code, it ran without throwing any exceptions, but it produced an incorrect average.

        //To fix this issue,I changed the division back to sum / numbers.length to calculate the average correctly:

        //return (double) sum / numbers.length;

        //By explicitly casting sum to double, we ensure that the division operation produces a floating-point result.


    }

}



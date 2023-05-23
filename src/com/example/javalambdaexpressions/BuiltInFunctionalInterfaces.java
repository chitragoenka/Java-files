package com.example.javalambdaexpressions;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is the number 4 even? " + isEven.test(4));

        // Function
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of the number 5 is: " + square.apply(5));

        // Consumer
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello! how are you?");

        // Supplier
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println("Random number: " + getRandomNumber.get());
    }
}


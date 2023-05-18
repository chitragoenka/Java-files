package com.example.overloading.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Please enter your animal's name: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Is it a dog? Yes or No: ");
            String input = scanner.nextLine();
            boolean isDog = input.equalsIgnoreCase("Yes");

            System.out.println("What breed is your dog?");
            String breed = scanner.nextLine();

            System.out.println("How much does your dog weigh?");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.println("How old in months is your dog?");

            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Is your dog a baby? (yes or no)");
            String isBabyInput = scanner.nextLine();
            boolean isBaby = isBabyInput.equalsIgnoreCase("yes");


            animals.add(new Animal(name, isDog, age, breed, weight, isBaby));
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}


package com.example.ObjectsinListsPractice.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Is it a dog? Yes or No: ");
            String input = scanner.nextLine();
            boolean isDog = input.equalsIgnoreCase("Yes");

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

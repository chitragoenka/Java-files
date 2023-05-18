package com.example.overloading.Animal;

public class Animal {
    private String name;
    private boolean isDog;
    private int age;
    private String breed;
    private double weight;
    private boolean isBaby;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name, boolean isDog, int age) {
        this.name = name;
        this.isDog = isDog;
        this.age = age;
    }
    public Animal(String name, boolean isDog, String breed, double weight){
        this.name = name;
        this.isDog = isDog;
        this.breed = breed;
        this.weight = weight;
    }
    public Animal(String name, boolean isDog, int age, String breed, double weight, boolean isBaby){
        this.name = name;
        this.isDog = isDog;
        this.age =age;
        this.breed = breed;
        this.weight = weight;
        this.isBaby = isBaby;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isBaby() {
        return isBaby;
    }

    @Override
    public String toString() {
        return name + " is a dog = " + isDog + ". " +
         name + " has the age of " + age + " in months and their breed is " + breed + ". " +
         name + " weighs " + weight + " and it's a baby = " + isBaby + ".";

    }
}


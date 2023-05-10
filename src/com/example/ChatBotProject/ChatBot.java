package com.example.ChatBotProject;

import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        greetUser();
        String name = askName();
        int age = guessAge();
        countToNumber();
        testProgrammingKnowledge();
    }
    public static void greetUser() {
        System.out.println("Hello! Welcome to the chat bot!");
    }
    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Can you please repeat your name for me?");
        String repeatedName = scanner.nextLine();

        if (repeatedName.equals(name)) {
            System.out.println("Thank you! Nice to meet you, " + name + " !");
        } else {
            System.out.println("I'm sorry, it seems like you didn't repeat your name correctly.");
            System.out.println("Thank you! Nice to meet you, " + name + " !");
        }
        return name;
    }
    public static int guessAge(){
        int guessedAge = 0; // initialize with default value
        System.out.println("Let me try guessing your age. Please answer the following questions in a YES or NO:");

        Scanner input = new Scanner(System.in);
        System.out.println("Do you sleep more than 10 hrs? ");
        String answer1 = input.nextLine();
        System.out.println("Do you take trips with your friends often? ");
        String answer2 = input.nextLine();
        System.out.println("Do you like to work late hours? ");
        String answer3 = input.nextLine();
        System.out.println("Do you remember using floppy disks or cassette tapes?");
        String answer4 = input.nextLine();
        System.out.println("Do you like to take walks in the morning?");
        String answer5 = input.nextLine();
        System.out.println("Did you ever use a typewriter for schoolwork or writing letters?");
        String answer6 = input.nextLine();
        System.out.println("Did you watch Sesame Street when you were a kid?");
        String answer7 = input.nextLine();
        System.out.println("Did you like to party hard?");
        String answer8 = input.nextLine();

        if(answer1.equalsIgnoreCase("yes") && answer8.equalsIgnoreCase("yes")){
            System.out.println("You are 20 years old.");
        }else if(answer2.equalsIgnoreCase("No") && answer7.equalsIgnoreCase("yes")){
            System.out.println("You are 40 years old.");
        }else if(answer3.equalsIgnoreCase("No") && answer8.equalsIgnoreCase("yes")){
            System.out.println("You are 30 years old.");
        }else if(answer4.equalsIgnoreCase("yes") && answer6.equalsIgnoreCase("yes")){
            System.out.println("You are 60 years old.");
        }else if(answer5.equalsIgnoreCase("YES") && answer7.equalsIgnoreCase("yes")){
            System.out.println("You are 50 years old.");
        } else{
            System.out.println("I am sorry! I need some more information.");
            System.out.println("What is your birth year?");
            int birthYear = input.nextInt();
            System.out.println("What is the current year?");
            int currentYear = input.nextInt();
            int correctAge = currentYear - birthYear;
            System.out.println("You are "+ correctAge +" years old.");
        }
        return guessedAge;
    }


    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to count to:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's test your programming knowledge.");

        String question = "Which of the following is NOT a programming language (Choose one option between A,B,C and D)?";
        String[] options = {"A. Car", "B. Java", "C. Python", "D. Javascript"};
        String correctAnswer = "A";
        String answer;

        while (true) {
            System.out.println(question);
            for (String option : options) {
                System.out.println(option);
            }
            answer = scanner.nextLine().toUpperCase();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct Answer!");
                break;
            } else {
                System.out.println("The answer is wrong. Please try again.");
            }
        }
    }

}


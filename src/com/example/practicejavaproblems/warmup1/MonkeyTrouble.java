package com.example.practicejavaproblems.warmup1;

public class MonkeyTrouble {

    // The monkeyTrouble method takes two boolean parameters: aSmile and bSmile
    // which represent whether monkey A and monkey B are smiling, respectively
    // This method determines whether or not we are in trouble based on the smiling status of the monkeys.
    // If the first if condition is not met, the second if statement is evaluated.
    // It checks if neither of the monkeys is smiling (aSmile is false and bSmile is false).
    // If this condition is true, it also means we are in trouble, and the method returns true.
    //If none of the above conditions are met, it means we are not in trouble. In this case, the method reaches the return false statement, and it returns false to indicate that we are not in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        //Print out different case scenarios

        System.out.println("Both monkeys are smiling. Are we in trouble? : " + monkeyTrouble(true, true));

        System.out.println("Both monkeys are not smiling. Are we in trouble? : " + monkeyTrouble(false, false));

        System.out.println("First monkey is smiling, but not the second. Are we in trouble? : " + monkeyTrouble(true, false));

        System.out.println("First monkey is not smiling, but the second monkey is. Are we in trouble? : " + monkeyTrouble(false, true));
    }
}

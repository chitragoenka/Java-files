package com.example.practicejavaproblems.warmup1;

public class SleepIn {
    public static void main(String[] args) {

        //Print out different case scenarios

        System.out.println("If it's a weekday and not a vacation, sleep in: " + sleepIn(true, false));

        System.out.println("If it's not a weekday but not a vacation, sleep in: " + sleepIn(false, false));

        System.out.println("If it's a weekday but a vacation, sleep in: " + sleepIn(true, true));

        System.out.println("If it's not a weekday but a vacation, sleep in: " + sleepIn(false, true));

    }
 // Create method sleepIn that takes two boolean parameters: weekday and vacation
// The sleepIn method itself checks if it is not a weekday (!weekday) or if the person is on vacation (vacation)
// If either of these conditions is true, it returns true, indicating that it is okay to sleep in
// Otherwise, it returns false, meaning that it is not okay to sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}

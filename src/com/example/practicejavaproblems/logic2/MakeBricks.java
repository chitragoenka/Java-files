package com.example.practicejavaproblems.logic2;

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {

        // calculate maximum no. of big bricks needed to reach the goal length by performing integer division of the goal length by the size of a big brick

        int maxBigBricksNeeded = goal / 5;

        // determine actual no. of big bricks used, considering the availability of big bricks
        // Compare maxBigBricksNeeded with the no. of big bricks available (big) and assign the smaller value to bigBricksUsed
        // This ensures that if there are fewer big bricks available than required, only the available number is used.
        int bigBricksUsed = Math.min(maxBigBricksNeeded, big);

        // calculate the remaining goal length after using the necessary number of big bricks
        // It subtracts the total length covered by the big bricks (bigBricksUsed * 5) from the initial goal length and stores the result in remainingGoal.
        int remainingGoal = goal - (bigBricksUsed * 5);

        if (remainingGoal <= small) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));   // true
        System.out.println(makeBricks(3, 1, 9));   // false
        System.out.println(makeBricks(3, 2, 10));  // true
    }
}

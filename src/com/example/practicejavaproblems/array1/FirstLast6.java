package com.example.practicejavaproblems.array1;

public class FirstLast6 {

    public static boolean firstLast6(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        return first == 6 || last == 6;
    }

    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}

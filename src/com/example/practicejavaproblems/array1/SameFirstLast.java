package com.example.practicejavaproblems.array1;

public class SameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        int first = nums[0];
        int last = nums[nums.length - 1];
        return first == last;
    }

    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));
        System.out.println(sameFirstLast(new int[]{}));
        System.out.println(sameFirstLast(new int[]{1}));
    }
}

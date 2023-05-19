package com.example.practicejavaproblems.array1;

public class CommonEnd {

    public static boolean commonEnd(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        if (lenA < 1 || lenB < 1) {
            return false;
        }

        return a[0] == b[0] || a[lenA - 1] == b[lenB - 1];
    }

    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

}

package com.example.practicingmethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        String str = getString();
        int num = getInteger();
        boolean bool = getBoolean();

        System.out.println(str);
        System.out.println(num);
        System.out.println(bool);
    }

    public static String getString() {
        return "String of text";
    }

    public static int getInteger() {
        return 5;
    }

    public static boolean getBoolean() {
        return false;
    }
}


package com.example.practicejavaproblems.warmup2;

public class DoubleX {


 // Create a method takes a String parameter and checks if the first instance of "x" in the string is immediately followed by another "x"

 //In the method, the index of the first "x" in str is obtained using the indexOf method
 // If no "x" is found (indexOf returns -1) or if the first "x" is the last character in the string, the method returns false since there is no second "x" following the first one.

 //If the conditions above are not met, a substring of length 2 starting from the first "x" is extracted using the substring method
 // This substring is then compared to the string "xx" using the equals method
 // If the substring is equal to "xx", it means the first "x" is immediately followed by another "x", and the method returns true.

  static  boolean doubleX(String str) {

      int firstXIndex = str.indexOf("x");
      if (firstXIndex == -1 || firstXIndex == str.length() - 1) {
          return false;
      }
      return str.substring(firstXIndex, firstXIndex + 2).equals("xx");

    }

    //Testing
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubleX("aaaxxx"));
        System.out.println(doubleX("xaaax"));
    }

}

package com.aditya;

import java.util.Arrays;

public class StringtoCharaRRAYMethod {
    public static void main(String[] args) {
        String s1 = "Hello World";
        //HELLO=5 & WORLD=5 & ONE SPACE BETWEEN WORDS--> 1
        // 5+5+1=11 elements/character array length
        //TOTAL OF 11 ELEMENTS FOR CHARACTER ARRAY
        char[] ch = s1.toCharArray();
//string toCharArray() method converts this string into character array.
// It returns a newly created character array, its length is similar to this
// string and its contents are initialized with the characters of this string.
        int len = ch.length;
        System.out.println("Char Array length: " + len); //11

        System.out.println(Arrays.toString(s1.toCharArray()));
        // [H, e, l, l, o,  , W, o, r, l, d]

        System.out.println("Char Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
        } //Hello World
    }
}

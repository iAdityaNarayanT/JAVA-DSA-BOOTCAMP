package com.aditya;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet");
        Scanner input = new Scanner(System.in);
        char c= input.next().charAt(0);
        //! --Implicitly-- trying to get ascii value of inputed character
//        int ascii_value= c;
        //! --Explicitly-- trying to get ascii value of inputed character
        int ascii_value= (int) (c);
        System.out.println(ascii_value);
    }
}

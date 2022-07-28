package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class ModifyingElementOfArray {
    public static void main(String[] args) {
    String [] str= new String[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <str.length; i++) {
        str[i]= in.next();
        }
        System.out.println(Arrays.toString(str)); //[aa, ss, dd, sd]

        str[1]="Aditya"; // modified element at index 1

        System.out.println(Arrays.toString(str)); // [aa, Aditya, dd, sd]
    }
}

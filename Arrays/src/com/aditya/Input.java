package com.aditya;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Inputting manually
        int[] arr = new int[5];
        arr[0]=4;
        arr[1]=43;
        arr[2]=2;
        arr[3]=456;
        arr[4]=7;
        System.out.println(arr[3]);// 456
        System.out.println();

        //Input via for loop
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextInt();
        }
        // Now to print the following array
        // 1. for-loop method
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //! 2. for each loop method: Enhanced for loop

        for (int num : arr) { // for every element in the array, print the element
            num+=1;
            System.out.print(num + " "); // num represents the element of the array

        }
//        System.out.println(arr[6]); //Error: Index 6 out of bounds for length 5
    }
}

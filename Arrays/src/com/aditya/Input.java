package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

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
        System.out.println(Arrays.toString(arr));

// Now to print the following array
        // ! 1.Arrays.toString()
        //  method is used to return a string representation of the contents of the
        // specified array.
        // The string representation consists of a list of the array’s elements,
        // enclosed in square brackets (“[]”). Adjacent elements are separated by the characters
        // “, ” (a comma followed by a space). It returns “null” if the array is null.



        //! 2. for-loop method
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //! 3. for each loop method: Enhanced for loop

//        for (int num : arr) { // for every element in the array, print the element
////            num+=1;
//            System.out.println(num + " "); // num represents the element of the array
//        }
//        System.out.println(arr[2]); //prints the element on the 2nd index of users input
////        System.out.println(arr[6]); //Error: Index 6 out of bounds for length 5

        //Array of objects--> Array
//        String [] str = new String[5];
//        for (int i = 0; i < str.length ; i++) {
//            str[i] = in.nextLine();
//
//        }
//        for (String strElements: str) {
//            System.out.println(strElements);
//        }
    }
}

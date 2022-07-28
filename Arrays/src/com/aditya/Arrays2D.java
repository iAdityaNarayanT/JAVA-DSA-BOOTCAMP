package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr =new int[3][3];
        for (int row = 0; row <arr.length; row++) //!outer loop to iterate over rows
        // arr.length--> gives number of rows
        {
            for (int col = 0; col<arr[row].length ; col++)//! inner loop to iterate over each column in specific row
                // arr[row].length--> every array at that particular row, the length of it
            {
            arr[row][col]=in.nextInt();
            }
        }
        // output
        //! using for loop
//        for (int row = 0; row <arr.length ; row++) {
//            for (int col = 0; col<arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//-->            1 2 3
//               4 5 6
//               7 8 9
        //! using Arrays.toString
//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row])); // basically arr[row] is an array itself
//
//        }
//-->                [1, 2, 3]
//                   [4, 5, 6]
//                   [7, 8, 9]
        //! Using enhanced for loop
        for(int[] a: arr)// for every element "a" (which is of type array) in arr array print the element
        {
            System.out.println(Arrays.toString(a));
        }
    }
}

package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class PlaygroundArray {
    public static void main(String[] args) {
//        int n = 0;
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter size of array");
//        n=in.nextInt();
//        int [] arr= new int [n] ;
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println("Enter next Element");
//            arr[i]=in.nextInt();
//        }
//        System.out.print("[");
//        for (int num : arr) {
//            System.out.print(num);
//        }
//        System.out.print("]");

//        int[][] arr2D = {{1,2,3},
//                         {4,5},
//                         {6,7,8,9}  };
//
////        System.out.println(Arrays.toString(arr2D[1])); //[4,5]
        /*

         */
        Scanner in = new Scanner(System.in);
        int[][] arr2D = new int[3][4];
//        System.out.println(arr2D.length); //------> 3
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < 4; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }
        //! NORMAL WAY TO PRINT 2D ARRAY:
//        for (int i = 0; i <arr2D.length ; i++) {
//            for (int j = 0; j <4 ; j++) {
//                System.out.print(arr2D[i][j] + " ");
//            }
//        }
//! foreach loop method to print 2 d array
        for ( int[] arr : arr2D){

                System.out.print(Arrays.toString(arr));

        }
//        System.out.println(Arrays.toString(arr2D[1])); // [5, 6, 7, 8]
//
//
//        for (int i = 0; i <3 ; i++) {
//            System.out.println(Arrays.toString(arr2D[i]));
//            /*
//            [1, 2, 3, 4]
//            [5, 6, 7, 8]
//            [9, 10, 11, 12]
//    }
//             */



    }
}


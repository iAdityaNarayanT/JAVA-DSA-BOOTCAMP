package com.aditya;

public class PaasByValueArrays {
//!When you pass an array to other method, actually the reference to that array is copied.

/*  1. Any changes in the content of array through that reference will affect
// the original array.

    2. But changing the reference to point to a new array will not change
// the existing reference in original method.*/

//!  In Java, the called method can update the contents of the array,
//  and it can update its copy of the array reference, but it can't update
// the variable in the caller that holds the caller's array reference.
//Hence ... what Java is providing is NOT pass-by-reference.
        public static void changeContent(int[] arr) {

            // If we change the content of arr.
            arr[0] = 10;  // Will change the content of array in main()
        }

        public static void changeRef(int[] arr) {
            // If we change the reference
            arr = new int[2];  // Will not change the array in main()
            arr[0] = 15;
//            System.out.println(arr[0]);
        }

        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};
            arr[0] = 4;
            arr[1] = 5;
            System.out.println(arr[0]); //4

            changeContent(arr);
            System.out.println(arr[0]);  // Will print 10..

            changeRef(arr);
            System.out.println(arr[0]);  // Will still print 10..
            // Change the reference doesn't reflect change here..
        }


    }


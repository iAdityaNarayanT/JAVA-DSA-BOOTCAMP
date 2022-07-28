package com.aditya;

public class Main {

        public static void main(String[] args) {
//            Array Of an OBJECT type--> string
            // syntax
            // datatype[] variable_name = new datatype[size];
            // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};
       // int[] rn= new int[]{1, 2, 3, 4, 5};
            int[] ros; // declaration of array. ros is getting defined in the stack
            ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);
//            Array of string or Array of object-->
            String[] rnos = new String[5];
            System.out.println(rnos[3]); // null--> by default value of empty array
//          Array of Primitive type--> int
            int[] rnos3 = new int[10];
            System.out.println(rnos3[6]); // 0

            int[] rnos2 = {1,2,3,4,5};
            System.out.println(rnos2[2]); // 3


        }
}

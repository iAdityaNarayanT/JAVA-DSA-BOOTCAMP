package com.aditya;

public class Main {

        public static void main(String[] args) {
//            Array Of an OBJECT type--> string
            String[] rnos = new String[5];
            System.out.println(rnos[3]); // null--> by default value of empty array
//          Array of Primitive type--> int
            int[] rnos3 = new int[10];
            System.out.println(rnos3[6]); // 0

            int[] rnos2 = {1,2,3,4,5};
            System.out.println(rnos2[2]); // 3

        }
}

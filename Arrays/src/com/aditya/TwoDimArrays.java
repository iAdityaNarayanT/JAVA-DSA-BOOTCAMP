package com.aditya;

public class TwoDimArrays {
    public static void main(String[] args) {

        int [][] arr= new int[3][4]; // Declaration syntax
//        The above syntax of array initialization will assign default values to all array elements according to the data type specified.
        int [][] arr1= { {1,2,3},
                        {4,5,6},   // Direct Declaration Method
                        {7,8,9}
                        };
        System.out.println(arr1[2][2]); //9

        int [][] arr3= new int[2][];
        arr3[0][0]=1; //! Getting null point exception error here
        System.out.println(arr3[0][0]);

        int[][] arr4= {{1,2,3},
                {3,4},
                {98,3873,373,383,83}
        };
        System.out.println(arr4[2][4]);//83
    }

}

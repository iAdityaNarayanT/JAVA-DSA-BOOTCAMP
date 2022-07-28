package com.aditya;

import java.util.Scanner;

public class InpOut2Darrays {
    public static void main(String[] args) {

    Scanner in =new Scanner(System.in);
    int [][] arr2D= new int[2][3];
        for (int row = 0; row <arr2D.length; row++) {
            for (int col = 0; col <arr2D[row].length ; col++) {
                arr2D[row][col]= in.nextInt();

            }
        }
        for (int row = 0; row <arr2D.length ; row++) {
            for (int col = 0; col <arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");

            }

        }
}
}

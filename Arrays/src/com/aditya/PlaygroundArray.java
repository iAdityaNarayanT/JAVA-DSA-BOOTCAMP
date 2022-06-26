package com.aditya;

import java.util.Scanner;

public class PlaygroundArray {
    public static void main(String[] args) {
        int n = 0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of array");
        n=in.nextInt();
        int [] arr= new int [n] ;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter next Element");
            arr[i]=in.nextInt();
        }
        System.out.print("[");
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.print("]");

    }
}


package com.aditya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(" Find the nth Fibonacci number ");
        System.out.println(" Enter the value of n");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int a=0;
        int b=1;
        int count= 2; // because we already know the first the numbers of the fibonacci series: 0,1
        while (count<=n){
            int temp=b; //intialising a temp variable and storing b into it,
            // bcoz a needs to store original value of b and b changes in next line;
            // thats why stored org value of b in temp
            b= a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
//! fibonacci= 0,1,1,2,3,5,8,13,21.........
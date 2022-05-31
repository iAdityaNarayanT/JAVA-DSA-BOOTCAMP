package com.aditya;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a NUMBER:");
        int a= input.nextInt();
        int count=a;
        System.out.println("Ten numbers after your number:" + a);
        while (count !=a+10)
        {
            System.out.println(count);
            count++;
        }





    }
}

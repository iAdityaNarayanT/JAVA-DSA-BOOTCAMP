package com.aditya;

import java.util.Scanner;

public class GreaterBtw2No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float a=input.nextFloat();
        float b=input.nextFloat();
        if (a == b) {
            System.out.println("Numbers are equal");
        }
        else
            {
                if (a > b) {
                    System.out.println("a is greater than b");
                } else
                    System.out.println("b is greater than a");

            }
        }
    }


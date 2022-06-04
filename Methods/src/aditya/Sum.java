package aditya;

import java.util.Scanner;

// This program is actually efficient version of Main.java using functions
public class Sum {
    public static void main(String[] args) {
        sum(); //anything that you want to use in static has to be static
    }
    static void  sum() //sum--> is identifier
                        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum = " + sum);
        }
    }


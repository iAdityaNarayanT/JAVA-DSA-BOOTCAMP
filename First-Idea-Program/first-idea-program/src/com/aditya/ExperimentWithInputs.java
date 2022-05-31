package com.aditya;

import java.util.Scanner;

public class ExperimentWithInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Different ways of Taking input from user--");
        System.out.println("Enter your first number :");
        System.out.println(input.nextInt()); //Here number being entered is directly being passed to the print statement


        System.out.println("Enter your second number: ");
        int a = input.nextInt(); //-> means whatever user inputs, it will be stored in a, and then using a we will be printing the number
        System.out.println("Your second number entered is: " + a);

        int b= input.nextInt(); //without asking the user for a number, number is being printed
        System.out.println(" Your third entered number is: " + b);

    }
}

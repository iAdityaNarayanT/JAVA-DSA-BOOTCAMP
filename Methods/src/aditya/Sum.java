package aditya;

import java.util.Scanner;

// This program is actually efficient version of Main.java using functions
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum()); //anything that you want to use in static has to be static
        System.out.println(Sum.sum);

    }
    int instanceVariable=200;
    static int sum;
    static int example=7;
    static  int sum() //sum--> is identifier.....sum()--> is function call
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            sum=num1+num2;
//            return num1+num2;


            System.out.println("Example printed " + example);

            Sum object = new Sum();
            System.out.println("Accessed instance variable: " + object.instanceVariable);

            return sum;
        }
    }



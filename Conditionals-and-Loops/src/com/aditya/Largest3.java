package com.aditya;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
//        System.out.println("Enter any three numbers");
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        if (a>b){
//            if (a>c){
//                System.out.println(a + "is greater than" + b + "&" +  c);
//            }
//            else {
//                System.out.println(c + "is greatest");
//            }
//
//        }
//        else {
//            if (b > c) {
//                System.out.println(b + "is greater than" + a + "&" + c);
//            } else {
//                System.out.println(c + "is greatest");
//            }
//        }

        //! SHORTER METHOD TO SOLVE THIS QUESTION:
//        System.out.println("Enter any three numbers");
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int max = a;
//        if (b>max){
//          max=b;
//        }
//          if (c>max){
//          max=c;
//        }
//           System.out.println(max);
        //! Another easy method to solve this question
        System.out.println("Enter any three numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max=0;
        max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}


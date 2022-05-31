package com.aditya;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        System.out.println("Enter a no.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while (num > 0) {
            int last_digit=num%10;
            ans= ans*10 + last_digit;
            num=num/10;
    }
        System.out.println(ans);
    }
}

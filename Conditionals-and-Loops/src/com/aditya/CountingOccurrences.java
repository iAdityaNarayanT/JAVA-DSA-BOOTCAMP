package com.aditya;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        System.out.println("Enter a no.");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        int count_7 = 0;
        while (num > 0) {
            if (num % 10 == 7) //to take out last digit
            {
                count_7++;
            }
            num = num / 10; //to reduce number to its first digit
    }
    System.out.println(count_7);
}

}

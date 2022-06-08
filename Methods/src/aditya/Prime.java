package aditya;
//THIS PROGRAM AIN'T WORKING FOR NUM==2,3
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int c=2;
        while (c<=sqrt(num))
        {
            if(num % c == 0){
                System.out.println("NOT Prime");
                return;
            }
            c=c+1;
        }        if (c*c>num){
            System.out.println("Prime");
        }
    }
}

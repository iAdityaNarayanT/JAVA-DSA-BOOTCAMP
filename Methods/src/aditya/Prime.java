package aditya;
//THIS PROGRAM AIN'T WORKING FOR NUM==2,3
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime ( int num){
            int c=2;
            if (num <= 1) {
                return false;
            }
            while (c*c <= num) {
                if (num % c == 0) {
//                    System.out.println("NOT Prime");
                    return false;
                }
                c = c + 1;
            }
        return c * c > num;
            // another way to write above 27th code line -->
        //      if (c * c > num) {
        //      return true;
        //        }
        //      return false;
    }
    }


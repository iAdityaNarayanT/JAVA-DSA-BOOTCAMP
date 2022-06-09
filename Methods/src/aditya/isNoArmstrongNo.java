package aditya;

import java.util.Scanner;

public class isNoArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:   ");
        int num= input.nextInt();
        boolean ans= isArmstrong(num);
        System.out.println("Entered number is armstrong number : " + ans);
        System.out.println("3 digit numbers which are armstrong numbers: ");

        for (int i=100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num) {
    int temp= num;
    int sum =0;
    while (temp>0){
        int ld= temp % 10;
        temp /= 10;
        sum=sum+ld*ld*ld;
    }
        return sum == num;
    }
}

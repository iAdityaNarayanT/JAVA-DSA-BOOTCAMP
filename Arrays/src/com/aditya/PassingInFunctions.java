package com.aditya;
import java.util.*;
public class PassingInFunctions {
    public static void main(String[] args) {

        int [] nums={1,2,3,4,5};
        System.out.println(nums[2]);
        change(nums);
        System.out.println(nums[2]);


        String [] str ={"AA" , "BB" , "CC" , "DD" , "EE"};
        System.out.println(str[4]);
        changeString(str);
        System.out.println(str[4]);
    }

    static void change(int[] numbers) {
        numbers[2]=4;
    }
    static void changeString(String[] alphabet) {
        alphabet[4]="Logan";
}
}

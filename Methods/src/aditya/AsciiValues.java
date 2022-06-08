package aditya;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner input = new Scanner(System.in);System.out.println("Its ascii value is: " + asciiValue(input.next().trim().charAt(0)));

    }
    static int asciiValue(char ch) {
        return ch; // here input is being taken in char type and value is being returned as integer type which is resulting in automatic type conversion from char to int
//        return (int) (ch); // can use explicit type casting
    }
}

package com.aditya;

import java.util.Scanner;
// “ Take an input character from keyboard and check weather it
//      is Upper case alphabet or lower case alphabet”
public class UpperLowerCaseWithConcepts{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch= in.next().trim().charAt(0);
        if (ch>='a' && ch<='z')  //! Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
                                 //! so basically here ch variable type and letter 'a' and 'z' are being treated as int type when condition is being tested inside if
            {
            System.out.println("LowerCase");
        }
        else {
            System.out.println("UpperCase");
        }
    }
}
//! if you wanna do explicit type casting inside if condition parenthesis use: if ((int) ch>='a' && (int) ch<='z')
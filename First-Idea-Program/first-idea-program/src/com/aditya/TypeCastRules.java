package com.aditya;


public class TypeCastRules {
    public static void main(String[] args) {
        int b=42;
        char c='a';
        short s=1024;
        int i =50000;
        float f= 5.67f;
        double d=0.01234;
        double result= ( f * b ) + ( i / c ) - ( d * s ) ; // (float) + (int) - (double) = (double)
        System.out.println( ( f * b ) + " " + ( i / c ) + " " + ( d * s ) );
        System.out.println(result);
        System.out.println( );
    }
}



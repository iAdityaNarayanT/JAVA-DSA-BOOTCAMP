package aditya;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String demo = greetings(input.nextLine());
        System.out.println("HelloOOO" + " " + demo);

    }
    static String greetings(String name){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello" + " " + in.nextLine());
        return name;
    }
}

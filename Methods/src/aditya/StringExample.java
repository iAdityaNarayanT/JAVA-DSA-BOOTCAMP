package aditya;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String personalised1 = myGreet1();
//        System.out.println("Hello1" + " " + personalised1);

        System.out.println("Enter your 2nd name");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String personalised2 = myGreet2(name);
        System.out.println(personalised2);
        System.out.println(name);
    }

//     static String myGreet1() {
//        Scanner input = new Scanner(System.in);
//         return input.nextLine();
//    }
    static String myGreet2(String name){
        String message= "hello2" + " " + name;
        return message;
    }
}

package aditya;

public class FunctionScope {
    public static void main(String[] args) {
        int a=4;
        int b=5;
    }
    static void random(){
//        System.out.println(a); //will give error; variables declared inside method(here main)cannot be accessed in outside method
    }
}

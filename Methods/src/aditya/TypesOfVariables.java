package aditya;

public class TypesOfVariables {
    static int a=10; // static variable
    static int b=20; // static variable
    int c=30; // instance variable
    public static void main(String[] args) {
        int d = 40;
        /*
        Static variable can be accessed in two ways inside a method:
        1.directly accessed
        2. accessed via class name
         */
        System.out.println(a); // METHOD 1 of accessing static variables
        System.out.println(TypesOfVariables.b); //METHOD 2 of accessing static variable using class name
        TypesOfVariables object = new TypesOfVariables(); // making object of class which has the instance variable in order to access the instance variable
        System.out.println(object.c); // accessed instance variable using object and dot operator
        System.out.println(d); // local variable directly accessed

    }
}

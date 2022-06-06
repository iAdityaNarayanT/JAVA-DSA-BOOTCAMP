package aditya;

public class TypesOfVariables {
    static int a=10; // static variable M1
    static int b=20; // static variable M2

    static int c=30; // static variable M3
    int d =40; // instance variable
    public static void main(String[] args) {
        int e = 50;

        /*
        Static variable can be accessed in two ways inside a method:
        M1. directly accessed
        M2. accessed via class name
        M3. creation of object, then accessing the variable using that object
         */

        System.out.println(a); // M1 Directly accessing static variables
        System.out.println(TypesOfVariables.b); // M2 of accessing static variable from same class using Class name
        System.out.println(Demo.g); //ACCESSING STATIC VARIABLES FROM A DIFFERENT CLASS(Demo) ClassName.StaticVariable

        //!If we access the static variable like the Instance variable (through an object),
        // the compiler will show the warning message, which won’t halt the program.
        // The compiler will replace the object name with the class name automatically.
        TypesOfVariables obj1 =new TypesOfVariables(); // M3 accessing static variable by creation of object obj2 of class TypesOfVariable
        System.out.println(obj1.b);//compiler showing warning message



        //now accessing instance variable
        TypesOfVariables obj2 = new TypesOfVariables(); // making object of class which has the instance variable in order to access the instance variable
        System.out.println(obj2.d); // accessed instance variable using object and dot operator



        System.out.println(e); // local variable directly accessed



        Demo obj3 = new Demo();
        System.out.println(obj3.f); //accessing instance variable from another class

    }
    public static class Demo{
        int f=60;
        static int g=70;
    }
}

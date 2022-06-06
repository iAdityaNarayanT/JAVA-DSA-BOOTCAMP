package aditya;


public class SwapPlusImpConceptsBelow {
    public static void main(String[] args) {
int a = 10;
int b= 20;
SwapPlusImpConceptsBelow object = new SwapPlusImpConceptsBelow();
object.swap(a,b);
System.out.println( a + " " + b ); // so we see the method swap() didn't swap the numbers
    }

    private  void swap(int a , int b) {
        int temp = a;
        a=b;
        b=temp;
    }
}
//In Java, Objects are passed by reference-->(false), and primitives are passed by value.
//This is half incorrect
// Everyone can easily agree that primitives are passed by value; there's no such thing in Java as a pointer/reference to a primitive.
//However, Objects are not passed by reference. A correct statement would be Object references are passed by value.

/*
when you have

Dog myDog = new Dog("Rover");
foo(myDog); // foo() is a method

you're essentially passing the address of the created Dog object to the foo method.

 */

// Object created has characteristics of the class (from which it was made) in heap memory
// So to access those characteristics in --heap memory-- you pass object reference as value to methods()
// passing value of object doesn't make sense in this case(object of a class)
//to use the variables/methods (present in the class) inside a method, we will have to use dot operator and for that you will need Object Reference
//ObjectReference.Property= someValue;
//So unlike primitives, ObjectReferences actually refer to a memory location in heap memory that has the object

/*
The key point is that Java never provides direct access to the values of objects themselves, in any circumstances.
The only access to object is through a reference to that object.
Because Java objects are always accessed through a reference, rather than directly
 */

/*  So, when calling a method

    For primitive arguments (int, long, etc.), the pass by value is the actual value of the primitive (for example, 3).
    For objects, the pass by value is the value of the reference to the object

 */
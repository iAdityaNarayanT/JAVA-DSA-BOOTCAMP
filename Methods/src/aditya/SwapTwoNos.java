package aditya;

public class SwapTwoNos {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("The numbers are : " + a + " " + b);
        // no changes in value of a and b

        System.out.println("The swapped numbers are : " + swap(a,b));
    }

    static String swap(int num1, int num2) {
        int temp = num1;
        num1=num2;
        num2=temp;
        //This change will be valid in this function scope only
        return num1 + " " + num2;
    }
}

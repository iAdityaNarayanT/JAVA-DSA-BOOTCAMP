package aditya;

public class ReturnJava {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        print();
        int ans= add(a,b);
        System.out.println(ans);
    }

    static void print() {
        System.out.println("Hello from void");
    }

    static int add(int x, int y) {
        System.out.println("Hello from Int");
        System.out.println(x+y);
        return 5;

    }
}

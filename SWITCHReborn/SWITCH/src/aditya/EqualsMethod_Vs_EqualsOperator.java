package aditya;

public class EqualsMethod_Vs_EqualsOperator {
    public static void main(String[] args) {
        String s1= new String("Fruit");
        String s2=new String("Fruity");
        String s3="Fruit";
        String s4="Fruit";
        s1= s2;
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);

    }
}
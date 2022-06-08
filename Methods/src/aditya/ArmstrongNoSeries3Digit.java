package aditya;
//! Print all the 3 digit armstrong numbers:
public class ArmstrongNoSeries3Digit {
    public static void main(String[] args) {

        System.out.println(" 3 digit Armstrong no.s are: " );
        armStrong();
    }
    static void armStrong() {
        int num = 100;
        int sum = 0;
        while (num >= 100 && num <= 999) {
            int temp = num;

            while (temp > 0) {
                int last_digit = temp % 10;
                temp = temp / 10;
                sum = sum + (last_digit * last_digit * last_digit);
            }
            if (sum == num) {
                System.out.println(num);
            }
            else
            {
                sum=0;
                num++;
            }
        }
    }
    }

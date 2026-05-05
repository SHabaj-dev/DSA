package _002_basic_maths;

/*
Formula
Very important relation:

LCM × GCD = a × b

So:

LCM = (a × b) / GCD
 */
public class L9_LCM {
    public static void main(String[] args) {

        int number = 12;
        int number2 = 10;

        int a = number;
        int b = number2;


        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        int lcm = (number * number2) / gcd;
        System.out.println("LCM: " + lcm);

    }

}

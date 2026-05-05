package _002_basic_maths;

public class L8_GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}

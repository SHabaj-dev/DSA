package _002_basic_maths;

public class L3_ReverseANumber {
    public static void main(String[] args) {

        int n = 12345;
        int reversedNumber = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println(reversedNumber);

    }
}

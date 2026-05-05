package _002_basic_maths;

public class L5_PalindromeNumber {
    public static void main(String[] args) {

        int n = 1234321;
        int reversedNumber = reverseNumber(n);

        boolean isPalindrome = n == reverseNumber(n) ? true : false;

        System.out.println(isPalindrome);
    }


    static int reverseNumber(int number) {
        int revNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            revNumber = (revNumber * 10) + lastDigit;
            number /= 10;
        }

        return revNumber;
    }
}

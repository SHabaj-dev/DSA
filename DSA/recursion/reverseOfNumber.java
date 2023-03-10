package recursion;

public class reverseOfNumber {
    static int rev = 0;
    public static void main(String[] args) {
        int num = 123;
        revNumber(num);
        System.out.println(revNumber2(num));
    }



    public static void revNumber(int num) {
        if (num == 0) {
            return;
        }
        int digit = num % 10;
        rev = (rev * 10) + digit;
        revNumber(num / 10);
    }

    public static int revNumber2(int n) {

        int digits = (int) Math.log10(n) + 1;
        return solve(n, digits);
    }

    static int solve(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * (int) Math.pow(10, digits - 1) + solve(n / 10, digits - 1);
    }
}

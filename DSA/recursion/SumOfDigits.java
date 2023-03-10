package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(sumOfDigit(n));

    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + (sumOfDigit(n / 10));
    }
}

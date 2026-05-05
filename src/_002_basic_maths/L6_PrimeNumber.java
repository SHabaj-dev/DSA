package _002_basic_maths;

public class L6_PrimeNumber {
    public static void main(String[] args) {

        int number = 11;
        boolean isPrime = true;

        if (number < 0) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);

    }
}

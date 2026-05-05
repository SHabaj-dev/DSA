package _002_basic_maths;


public class L1_CountDigits {
    public static void main(String[] args) {

        int number = 12345;
        int digitCount = 0;

        while (number > 0) {
            digitCount++;
            number = number / 10;
        }

        System.out.println("Count: " + digitCount);

    }
}

package _002_basic_maths;

public class L10_ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int digits = countDigits(number);
        int copyNumber = number;
        int resultNumber = 0;

        while (copyNumber > 0) {
            int lastDigit = copyNumber % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * lastDigit;
            }

            resultNumber = resultNumber + power;
            copyNumber = copyNumber / 10;

        }

        boolean isArmstrongNumber = number == resultNumber ? true : false;
        System.out.println(isArmstrongNumber);
    }

    static int countDigits(int number) {
        int count = 0;
        if (number >= 1 && number <= 9) {
            return 1;
        }
        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }
}

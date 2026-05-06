package _002_basic_maths;

public class L11_PowerOfNumber {
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(result);
    }
}

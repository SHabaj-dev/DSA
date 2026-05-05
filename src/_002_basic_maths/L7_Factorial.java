package _002_basic_maths;

public class L7_Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = 1;
        while (number > 0) {
            result = result * number;
            number -= 1;
        }

        System.out.println(result);
    }
}

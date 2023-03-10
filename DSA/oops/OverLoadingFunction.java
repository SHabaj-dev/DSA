package oops;

import java.util.Scanner;

public class OverLoadingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();

        System.out.printf("Sum of %d and %d is %d:",num1, num2, sum(num1, num2));
        System.out.println();
        System.out.printf("Sum of %f and %f is %f:",num3, num4, sum(num4, num4));

    }


    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static float sum(float num1, float num2){
        return num1 + num2;
    }
}

package bitWiseOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * https://leetcode.com/problems/counting-bits/description/
 */
public class CountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    }

    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];
        if(n == 0){
            arr[0] = 0;
        }
        return arr;
    }
}

package arrays;

import java.util.Arrays;
import java.util.Collections;

/*
Problem Links ->
Leet Code -> https://leetcode.com/problems/move-zeroes/description/
gfg Practice -> https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 1, 9, 4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void moveZeroes(int[] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
}

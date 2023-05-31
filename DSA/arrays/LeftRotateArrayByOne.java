package arrays;

import java.util.Arrays;

/*
Problem Link -> https://www.codingninjas.com/codestudio/problems/left-rotate-an-array-by-one_5026278?leftPanelTab=0
 */
public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(arr, arr.length)));
    }

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }
}


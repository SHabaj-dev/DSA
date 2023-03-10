package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5 ,2 ,7};
        System.out.println(Arrays.toString(ans));
    }

    static int[] getMinMax(int[] arr) {
        return helper(arr, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    static int[] ans = new int[2];

    static int[] helper(int[] arr, int min, int max, int currentIndex) {
        if (currentIndex >= arr.length) {
            ans[0] = min;
            ans[1] = max;
        }

        if (arr[min] > arr[currentIndex]) {
            return helper(arr, arr[currentIndex], max, ++currentIndex);
        } else {
            return helper(arr, min, arr[currentIndex], ++currentIndex);
        }
    }
}

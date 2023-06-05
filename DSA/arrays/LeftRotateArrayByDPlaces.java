package arrays;

import java.util.Arrays;

/*
Problem Link
LeetCode-> https://leetcode.com/problems/rotate-array/
Code Studio-> https://www.codingninjas.com/codestudio/problems/rotate-array_1230543?leftPanelTab=1
GFG Practice-> https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1
 */
public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 11, 2, 43, 1, 1};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] arr = new int[k];
        int i;
        for (int m = 0; m < k; m++) {
            arr[m] = nums[m];
        }

        for (i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }

        for (i = nums.length - k; i < nums.length; i++) {
            nums[i] = arr[i - (nums.length - k)];
        }
    }

}

package arrays;

import java.util.Arrays;

/*
Problem Link ->
GFG -> https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
leetCode ->
Code Studio
 */
public class Sort_0And_1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregate0and1(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[low] == 0) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem Link ->
GFg -> https://practice.geeksforgeeks.org/problems/next-permutation5226/1
Leetcode -> https://leetcode.com/problems/next-permutation/
code forces -> https://www.codingninjas.com/codestudio/problems/next-greater-permutation_6929564
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] A) {
        if (A == null || A.length <= 1) return;
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) i--;
        if (i >= 0) {
            int j = A.length - 1;
            while (A[j] <= A[i]) j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, A.length - 1);
    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j) swap(A, i++, j--);
    }
}

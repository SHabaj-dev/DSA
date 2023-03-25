package arrays;

/*
To solve this problem we need to understand the moose algo

Steps ->
1). Apply moose element
2). verify if the element is majority or not.

Problem Link ->
GFG -> https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
Leetcode -> https://leetcode.com/problems/majority-element/
Code Studio ->
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 1, 3, 1, 1};

        System.out.println(majorityElement(arr, arr.length));
    }

    public static int majorityElement(int[] a, int size) {
        // your code here
        int count = 0;
        int element = 0;
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            if (count == 0) {
                count = 1;
                element = a[i];
            } else if (a[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        for (int i = 0; i < size; i++) {
            if (a[i] == element) {
                count2++;
            }
        }
        if (count2 > size / 2) {
            return element;
        }
        return -1;
    }
}

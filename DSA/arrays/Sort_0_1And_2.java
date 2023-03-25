package arrays;

import java.util.Arrays;

/*
Problem Link ->
gfg -> https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
leetCode -> https://leetcode.com/problems/sort-colors/description/
code Studio -> https://www.codingninjas.com/codestudio/problems/sort-0-1-2_631055

 */
public class Sort_0_1And_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 1, 2};
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] a, int n)
    {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){

            if(a[mid] == 0){
                swap(a, mid, low);
                mid++;
                low++;
            }else if(a[mid] == 1){
                mid++;
            }else if(a[mid] == 2){
                swap(a, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

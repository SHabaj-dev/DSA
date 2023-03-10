package arrays;
/*
https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
 */

import java.util.*;

public class PrintAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            PrintAlternate gfg = new PrintAlternate();
            gfg.print(arr, n);
            System.out.println();

        }
    }

    public void print(int arr[], int n) {
        // your code here
        for(int i = 0 ; i < n; i+= 2){
            System.out.print(arr[i] + " ");
        }
    }
}

package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem Links ->
gfg -> https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
Leetcode -> https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
code studio -> https://www.codingninjas.com/codestudio/problems/alternate-numbers_6783445
 */
public class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println(Arrays.toString(alternateNumbers(arr)));
    }

    public static int[] alternateNumbers(int[] a) {
        // Write your code here.
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        for (int value : a) {
            if (value >= 0) {
                posList.add(value);
            } else {
                negList.add(value);
            }
        }

        for(int i = 0; i < a.length / 2; i++){
            a[2 * i] = posList.get(i);
            a[2 * i + 1] = negList.get(i);
        }

        return a;
    }
}

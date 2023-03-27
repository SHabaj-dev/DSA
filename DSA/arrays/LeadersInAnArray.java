package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problem Link ->
GFG -> https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
code studio -> https://www.codingninjas.com/codestudio/problems/superior-elements_6783446
 */
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(superiorElements(arr));
    }

    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        List<Integer> ansList = new ArrayList<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= max) {
                max = a[i];
                ansList.add(max);
            }
        }
        Collections.reverse(ansList);
        return ansList;

    }
}

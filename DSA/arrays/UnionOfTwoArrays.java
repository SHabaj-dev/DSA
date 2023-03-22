package arrays;

import java.util.ArrayList;

/*
Problem Link ->
Gfg -> https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
CodeStudio -> https://www.codingninjas.com/codestudio/problems/sorted-array_6613259?leftPanelTab=1
 */
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length).toString());
    }

    /*
    To solve this problem we can use set as brute force approach
    time complexity for using the set approach will be O(n log n)
     */

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        // add your code here
        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArrayList = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (unionArrayList.size() == 0
                        || unionArrayList.get(unionArrayList.size() - 1) != arr1[i]) {
                    unionArrayList.add(arr1[i]);
                }
                i++;
            } else {
                if (unionArrayList.size() == 0
                        || unionArrayList.get(unionArrayList.size() - 1) != arr2[j]) {
                    unionArrayList.add(arr2[j]);
                }
                j++;
            }
        }

        while (j < arr2.length) {
            if (unionArrayList.size() == 0
                    || unionArrayList.get(unionArrayList.size() - 1) != arr2[j]) {
                unionArrayList.add(arr2[j]);
            }
            j++;
        }

        while (i < arr1.length) {
            if (unionArrayList.size() == 0
                    || unionArrayList.get(unionArrayList.size() - 1) != arr1[i]) {
                unionArrayList.add(arr1[i]);
            }
            i++;
        }


        return unionArrayList;
    }
}

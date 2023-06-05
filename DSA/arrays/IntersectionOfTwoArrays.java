package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Problem Links ->
codeStudio -> https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4, 5, 6, 7};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int j : arr1) {
            a.add(j);
        }
        for (int j : arr2) {
            b.add(j);
        }

        System.out.println(findArrayIntersection(a, a.size(), b, b.size()));
    }

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        // Write Your Code Here.
        int i = 0;
        int j = 0;
        ArrayList<Integer> ansList = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr2.get(j) < arr1.get(i)) {
                j++;
            } else {
                ansList.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return ansList;
    }


}

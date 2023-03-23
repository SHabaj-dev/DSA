package arrays;

/*
Problem Link ->
https://www.codingninjas.com/codestudio/problems/occurs-once_1214969
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 4, 5, 3, 4};
        System.out.println(occursOnce(arr, arr.length));
    }

    public static int occursOnce(int[] a, int n) {
        // Write your code here.

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= a[i];
        }
        return ans;
    }
}

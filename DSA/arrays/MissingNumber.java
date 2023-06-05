package arrays;

/*
Problem Links->
GFG -> https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
leetCode -> https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
//        System.out.println(missingNumber(arr, arr.length));
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums, int n) {
        int xor1 = nums[0];
        int xor2 = 1;
        n -= 1;

        for (int i = 1; i < n; i++)
            xor1 = xor1 ^ nums[i];

        for (int i = 2; i <= n + 1; i++)
            xor2 = xor2 ^ i;

        return (xor1 ^ xor2);

    }

    //Solution for the leetcode
    public static int missingNumber(int[] nums) {
        int sumOfN = 0;
        int sumOfArray = 0;
        int N = nums.length;
        sumOfN = (N * (N + 1)) / 2;
        for (int num : nums) {
            sumOfArray += num;
        }

        return (sumOfN - sumOfArray);
    }
}

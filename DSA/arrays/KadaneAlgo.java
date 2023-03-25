package arrays;

/*
Problem Links ->
GFG -> https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/0
Leetcode -> https://leetcode.com/problems/maximum-subarray/description/
Code Studio ->https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_630526

 */
public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}

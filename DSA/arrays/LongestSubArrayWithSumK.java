package arrays;
/*
Problem Link ->
GFG -> https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
LeetCode -> https://leetcode.com/problems/subarray-sum-equals-k/
 */
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int K = 15;
        System.out.println(lenOfLongSubArr(arr, K, arr.length));
    }

    private static int lenOfLongSubArr(int[] arr, int k, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                length = i+1;
            }else if(map.containsKey(sum - k)){
                length = Math.max(length, i-map.get(sum - k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return length;
    }
}

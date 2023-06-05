package arrays;

import java.util.HashMap;
import java.util.Map;

/*
Problem Link ->
leetCode -> https://leetcode.com/problems/two-sum/description/
gfg -> https://practice.geeksforgeeks.org/problems/pair-sum-existence/1
 */
public class _2Sum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}

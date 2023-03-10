package recursion;

import java.util.Arrays;

/*
https://leetcode.com/problems/find-triangular-sum-of-an-array/
 */
public class TriangularSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 , 4, 5 };
        findSum(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int ans = 0;
    static void findSum(int[] arr){
        if(arr.length < 1){
            return;
        }
        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < temp.length; i++){
            int x = (arr[i] + arr[i + 1]) % 10;
            temp[i] = x;
        }
//        System.out.println(Arrays.toString(arr));
        ans = arr[0];
        findSum(temp);

        System.out.println(Arrays.toString(arr));

    }
}

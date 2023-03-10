package arrays;
/*
https://practice.geeksforgeeks.org/problems/7a33c749a79327b2889d420dd80342fff33aac6d/1
 */
public class MaximumSumWithoutAdjacent {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        System.out.println(findMaxSum(arr));
    }

    static int findMaxSum(int[] arr){
        int max1 = 0, max2 = 0;
        for(int i = 0;i< arr.length;i++){
            if(i%2 == 0){
                max2 = Math.max(max1, max2);
                max1 = max1+arr[i];
            }else{
                max1 = Math.max(max1, max2);
                max2 = max2+arr[i];
            }
        }
        return Math.max(max1, max2);
    }
}

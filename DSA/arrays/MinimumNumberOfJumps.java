package arrays;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJump(arr));
    }

    static int minJump(int[] arr){
        int i = 0;
        int totalJump = 0;
        int length = arr.length;
        while(i < length){
            totalJump++;
            int temp = arr[i];
            i = i + temp;
        }
        return totalJump;
    }
}

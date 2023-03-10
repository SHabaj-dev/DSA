package arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLAstPosition {
    public static void main(String[] args) {
        long[] arr = {0, 1, 1 ,1, 2 ,3, 4};
        System.out.println(find(arr, arr.length, 5));

    }
    static ArrayList<Long> find(long arr[], int n, int x){
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(findFirstOccurance(arr, n , x));
        ans.add(findSecondOccurance(arr, n , x));
        return ans;
    }

    static long findFirstOccurance(long[] arr, int n, int x){
        int  start = 0;
        int end = n - 1;
        long ans = -1;
        int mid = start + (end - start) / 2;
        while (start <= end){
            if(arr[mid] == x){
                ans = mid;
                end = mid - 1;
            }else if(arr[mid] > x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    static long findSecondOccurance(long[] arr, int n, int x){
        int  start = 0;
        int end = n - 1;
        long ans = -1;
        int mid = start + (end - start) / 2;
        while (start <= end){
            if(arr[mid] == x){
                ans = mid;
                start = mid + 1;
            }else if(arr[mid] > x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}

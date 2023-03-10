package recursion;
import java.util.*;
public class PalendromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1,5};
        System.out.println(isPalendrome(arr, 0, (arr.length - 1)));
    }

    public static boolean isPalendrome(int[] arr, int start, int end){
        if(start >= end){
            return true;
        }

        
        
        if(arr[start] == arr[end]){
            return isPalendrome(arr, ++start, --end);
        }

        return false;
        
    }
}

package arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 5));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while(start <= end){

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        return -1;
    }
}

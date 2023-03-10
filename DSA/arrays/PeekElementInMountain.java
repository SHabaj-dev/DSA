package arrays;

public class PeekElementInMountain {
    public static void main(String[] args) {
        int[] arr = {3, 4};
        System.out.println(peakElement(arr, arr.length));
    }

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int start = 0;
        int end = n - 1;


        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
//            mid = start + (end - start) / 2;
        }
        return end;
    }
}

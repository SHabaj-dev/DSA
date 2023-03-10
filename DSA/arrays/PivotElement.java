package arrays;

public class PivotElement {
    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 17, 1};
        System.out.println(getPivot(arr));
        System.out.println(findPivot(arr, 0, arr.length - 1));
    }

    static int getPivot(int[] arr) {
        int start = 0;
         int end = arr.length - 1;

         while(start < end){
             int mid = start + (end - start) / 2;
             if(arr[mid] >=arr[0]){
                 start = mid + 1;
             }else{
                 end = mid;
             }
         }
         return end;
    }

    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
}


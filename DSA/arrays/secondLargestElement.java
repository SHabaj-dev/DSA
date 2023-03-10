package arrays;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr, arr.length));
    }

    static int print2largest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n ; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

        }
        return secondLargest;
    }
}

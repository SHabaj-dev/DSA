package arrays.sorting;

import utilities.UtilitiesClass;

import java.util.Arrays;

/*
Select minimum and swap it  with its position in the array
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24 ,52, 20, 9};
        UtilitiesClass uc = new UtilitiesClass();

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            //Finding the min element in the array
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
//            swap the min element with the current element
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
            uc.swapArray(arr, i, min);
        }

        System.out.println(Arrays.toString(arr));
    }
}

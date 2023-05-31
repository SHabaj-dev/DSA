package utilities;

public class UtilitiesClass {


    public void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

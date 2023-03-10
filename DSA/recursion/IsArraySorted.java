package recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 7, 4 ,5};
        System.out.println(isSortedArray(arr, 0));
    }

    static boolean isSortedArray(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] <= arr[index + 1] && isSortedArray(arr, ++index);
    }
}

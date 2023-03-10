package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 ,6 ,7};
        int target = 6;
        System.out.println(linearSearch(arr, 0, target));
    }

    static int linearSearch(int[] arr, int index, int target){
        if(index == arr.length - 1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr, ++index, target);
    }
}

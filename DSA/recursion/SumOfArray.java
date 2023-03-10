package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(arr));
    }

    static int index = 0;
    static int sumOfArray(int[] arr){
        if(index == arr.length - 1){
            return arr[index];
        }

        return arr[index++] + sumOfArray(arr);
    }
}

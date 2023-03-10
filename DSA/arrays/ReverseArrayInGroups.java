package arrays;


import java.util.*;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list.toString());

    }

    static void reverseInGroup(ArrayList<Integer> list, int n, int k){
        Object[] arr = list.toArray();
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        for(int i = 0; i < n; i++){
            list.add(i, (Integer) arr[i]);
        }
    }

    static void reverseArray(Object[] arr, int start, int end){
        while(start <= end){
            Object temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

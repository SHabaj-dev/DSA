import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int size = (int)Math.pow(10, 8);
        int[] arr = new int[size];

        Arrays.fill(arr, 0);
//        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < 256; i++){
            System.out.print((char)i + " ");
        }
    }
}

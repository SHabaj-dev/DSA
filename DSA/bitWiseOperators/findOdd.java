package bitWiseOperators;


public class findOdd {
    public static void main(String[] args) {
        int[] arr = {12, 12, 14, 9, 14, 14,14};
        int res = 0;
        for(int i: arr){
            res ^= i;
            System.out.print(res + " ");
        }

        System.out.println(res);

    }
}

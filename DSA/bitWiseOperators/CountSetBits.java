package bitWiseOperators;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countSetBits(num));
    }

    public static int countSetBits(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}

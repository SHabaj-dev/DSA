package bitWiseOperators;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String bits = "";
        while(number > 0){
            if((number&1) == 1){
                bits = 1 + bits;
            }else{
                bits = 0 + bits;
            }
            number >>= 1;
        }
        System.out.println(bits);
        sc.close();
    }
}

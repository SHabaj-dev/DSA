package BasicMaths;
/*
https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
 */
import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrongNumber(n));
    }

    static String isArmstrongNumber(int n){
        int temp = n;
        int result = 0;
        while(temp != 0){
            int digit = temp % 10;
            result = result + (int)(Math.pow(digit, 3));
            temp /= 10;
        }
        if(result == n){
            return "Yes";
        }
        return "No";
    }
}

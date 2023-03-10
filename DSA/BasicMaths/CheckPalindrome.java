package BasicMaths;
/*
https://practice.geeksforgeeks.org/problems/palindrome0746/1
 */
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(is_palindrome(n));
    }

    static boolean is_palindrome(int n){
        int temp = n;
        int revNum = 0;
        while(temp != 0){
            int digit = temp % 10;
            revNum = (revNum * 10) + digit;
            temp /= 10;
        }

        if(revNum == n){
            return true;
        }
        return false;
    }
}

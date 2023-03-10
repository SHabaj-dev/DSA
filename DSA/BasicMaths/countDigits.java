package BasicMaths;
/*
https://practice.geeksforgeeks.org/problems/count-digits5716/1
 */
import java.util.*;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenlyDivides(n));
    }

    static int evenlyDivides(int n){
        int count = 0;
        int temp = n;
        while(temp != 0){
            int digit = temp % 10;
            if(digit != 0){
                if(n % digit == 0){
                    count++;
                }
            }
            temp /= 10;
        }
        return count;
    }
}

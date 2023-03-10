package BasicMaths;
/*
https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
 */
import java.util.*;
public class SumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDivisor(n));
    }

    static long sumOfDivisor(int N){
        long ans=0;
        for(long i=1;i<=N;i++){

            ans+=((N/i)*i);

        }
        return ans;
    }
}

package recursion;
/*
https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
 */
import java.util.*;
public class CountingUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }

    static void printNos(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }
//        System.out.println(N);
        printNos(N - 1);
        System.out.println(N);
    }
}

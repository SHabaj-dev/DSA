package patterns;
/*
https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6
 */
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n);
    }

    static void printTriangle(int n){
        for(int i = 1; i <= n; i++){
            int count = 1;
            for(int j = n; j >= i; j--){
                System.out.printf("%d ", count++);
            }
            System.out.println();
        }
    }
}

package patterns;
/*
https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5
 */
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n);
    }

    static void printTriangle(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

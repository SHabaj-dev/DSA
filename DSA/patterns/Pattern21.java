package patterns;
/*
https://practice.geeksforgeeks.org/problems/square-pattern-1662287714/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_21
 */
import java.util.*;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n);
    }

    static void printSquare(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == 1 || i == 1 || j == n || i == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

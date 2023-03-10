package patterns;
/*
https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8
 */
import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n);
        sc.close();
    }

    static void printTriangle(int n){
        for(int i = n; i > 1; i--){
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n - i -1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

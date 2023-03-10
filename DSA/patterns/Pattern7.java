package patterns;
/*
https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7
 */

import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n);
    }

    static void printTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

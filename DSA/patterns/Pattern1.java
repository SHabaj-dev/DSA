package patterns;

import java.util.Scanner;

/**
 Print the Following Pattern
* * * * 
* * * * 
* * * * 
* * * * 

 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
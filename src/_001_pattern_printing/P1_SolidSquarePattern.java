package _001_pattern_printing;

/*
Problem
Print a solid square of size n.

Example
For n = 4

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */

public class P1_SolidSquarePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

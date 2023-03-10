package bitWiseOperators;

/*
    2 -> 0 1 0
    1 -> 0 0 1
    -----------
    | -> 0 1 1
    & -> 0 0 0
    ~ -> 1 1 0

 */

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 2;

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(~a);
        System.out.println(a >> 33);
    }
}

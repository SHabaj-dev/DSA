package recursion;
/*
https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n
 */
public class FactorialOfNNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }

    static int printFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n * printFactorial(n - 1);
    }
}

package recursion;
/*
https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms
 */
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));
    }

    static int sumOfSeries(int n){
        if(n == 1){
            return 1;
        }

        return (int)Math.pow(n, 3) + sumOfSeries(--n);
    }
}

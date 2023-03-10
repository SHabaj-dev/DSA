package recursion;

public class sumOfSquareofN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSqrOfN(n));
    }

    private static int sumOfSqrOfN(int n){
        if(n == 1){
            return 1;
        }
        return (n * n) + sumOfSqrOfN(--n);
    }
}

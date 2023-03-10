package recursion;

public class sumOfnNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfN(n));
    }

    public static int sumOfN(int n){
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(--n);
    }
}

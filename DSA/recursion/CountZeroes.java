package recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(100203));
    }

    static int countZeroes(int n) {
        return solve(n, 0);
    }

    static int solve(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return solve(n / 10, ++count);
        }
        return solve(n / 10, count);
    }
}

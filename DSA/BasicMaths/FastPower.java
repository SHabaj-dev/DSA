package BasicMaths;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(fastPower(12, 21, 1000000007));
    }

    static long fastPower(long num, long rev, int n) {
        long res = 1;

        while (rev > 0) {
            if ((rev & 1) != 0) {
                res = ((res % n) * (num % n)) % n;
            }
            num = ((num % n) * (num % n)) % n;
            rev = rev >> 1;
        }
        return res;
    }
}

package BasicMaths;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 3;
//        System.out.println(powerOfTwo(n));
        System.out.println(powerOfTwo(n));
    }

    static boolean powerOfTwo(int n){
        return((n & (n - 1)) == 0);
    }
}

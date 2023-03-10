package BasicMaths;

import java.util.ArrayList;

public class FatorialUptoN {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(6));
    }

    static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> arrayList = new ArrayList<>();
        for(long i = 1; i <= n; i++){
            arrayList.add(getFactorial(i));
        }
        arrayList.remove(0);
        return arrayList;
    }

    static long getFactorial(long n){
        long fact = 1;
        for(long i = 1; i < n; i++){
            fact *= i;
        }
        return fact;
    }
}

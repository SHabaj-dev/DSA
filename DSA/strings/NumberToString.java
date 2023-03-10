package strings;

public class NumberToString {
    public static void main(String[] args) {
        int num = 123;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String ans = "";
        while(num != 0){
            int digit = num % 10;
            ans = str[digit] + ans;
            num /= 10;
        }

        System.out.println(ans);
    }
}

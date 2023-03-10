package recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "abcdefg";

        System.out.println(findLength(str));
    }

    static int findLength(String str){
        if(str.equals("")){
            return 0;
        }

        return findLength(str.substring(1)) + 1;
    }
}

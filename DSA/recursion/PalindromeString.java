package recursion;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "aabaa";
        char[] charArray = str.toCharArray();
        revString(charArray, 0, charArray.length - 1);
        String str2 = Arrays.toString(charArray);
        if(str == str2){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("No Palindrome");
        }
    }

    static void revString(char[] str, int start, int end){
            if(start >= end){
                return ;
            }
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            revString(str, ++start, --end);
    }



}

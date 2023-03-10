package recursion;

public class FirstUpperCaseInString {
    public static void main(String[] args) {
        String str = "abadeA";
        System.out.println(searchFirstCapital(str, 0));
    }

    static int searchFirstCapital(String str, int currIndex){
        if(str.charAt(currIndex) >= 'A' && str.charAt(currIndex) <= 'Z'){
            return currIndex;
        }
        if(currIndex == str.length() - 1){
            return -1;
        }

        return searchFirstCapital(str, ++currIndex);
    }


}

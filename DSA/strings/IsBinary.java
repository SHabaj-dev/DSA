package strings;

public class IsBinary {
    public static void main(String[] args) {
        String str = "0111100110101100";

        System.out.println(isBinary(str));
    }
    static boolean isBinary(String str)
    {
        //Your code here
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '2'){
                return false;
            }
        }
        return true;
    }
}

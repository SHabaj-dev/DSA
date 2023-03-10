package strings;

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "This i$s @wsome";
        char[] ch = str.toCharArray();
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'
            || ch[i] >= 'A' && ch[i] <= 'Z'){
                ans += ch[i];
            }
        }
        System.out.println(ans);
    }
}

package POTD_GFG;
import java.util.*;
public class caseSpecificSortingOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(caseSort(str));
        sc.close();
    }

    public static String caseSort(String str){
        ArrayList<Character> v1 = new ArrayList<>();
        ArrayList<Character> v2 = new ArrayList<>();
        int n = str.length();
        String s = "";
        for(int i = 0; i < n; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) >= 'z'){
                v1.add(str.charAt(i));
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                v2.add(str.charAt(i));
            }

            Collections.sort(v1);
            Collections.sort(v2);
        }

        int i = 0, j = 0;
        for(int k = 0; k < n; k++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'A'){
                s += v1.get(i);
                ++i;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                s += v2.get(j);
                j++;
            }
        }
        return s;
    }
}

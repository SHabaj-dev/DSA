package _001_pattern_printing;

public class _003_Right_Angle_Triangle_two {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package _001_pattern_printing;

public class _002_Right_Angle_Triangle {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package _001_pattern_printing;

public class P3_SolidRightAngleTrianglePattern {
    public static void main(String[] args) {

        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

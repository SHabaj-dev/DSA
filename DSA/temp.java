import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Lucky Number : ");
        int num = sc.nextInt();

        System.out.println("Enter your first Name: ");
        String fName = sc.next();

        System.out.println("Enter ANy character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Enter a Floating Point Number: ");
        float fNumber = sc.nextFloat();


        System.out.println(num);
        System.out.println(fName);
        System.out.println(ch);
        System.out.println(fNumber);
    }
}

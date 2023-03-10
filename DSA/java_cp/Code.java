package java_cp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("/home/shabaj/Desktop/learn/DSA/java_cp/output.txt");

        try(Scanner ip = new Scanner(new File("/home/shabaj/Desktop/learn/DSA/java_cp/input.txt"));
            PrintWriter op = new PrintWriter(f); ){

                int x = ip.nextInt();
                int y = ip.nextInt();
                op.println(x+y);
//            int t = ip.nextInt();
//            while(t-- != 0){
//                int n = ip.nextInt();
////                op.print(new Code().printPattern(n));
//            }
        }
    }

    Object printPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return null;
    }
}

package javaLab;

import java.util.Scanner;

public class PercentageOfSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of five Subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int totalMarks = 500;
        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        float percentage = (float) (sum * 100 / totalMarks);
        System.out.println(percentage);
    }
}

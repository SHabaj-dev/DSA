package javaLab;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Is Vowel");
        } else {
            System.out.println("Is Consonant");
        }
    }
}

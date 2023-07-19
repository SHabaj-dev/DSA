package stack;

import java.util.Scanner;

public class ReverseStackUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();
        StackImplementation stack = new StackImplementation(inputString.length());

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        for (int i = 0; i < inputString.length(); i++) {
            reversedString.append(stack.pop());
        }

        System.out.println("Reversed String is " + reversedString);

    }
}

class StackImplementation {
    int top = -1;
    private int size;
    private char[] stack;

    public StackImplementation(int size) {
        this.size = size;
        stack = new char[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= size;
    }

    public void push(char data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return '\0';
        }
        return stack[top--];
    }
}

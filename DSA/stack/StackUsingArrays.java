package stack;

public class StackUsingArrays {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(6);
        System.out.println();
        stack.display();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
        System.out.println();
        System.out.println(stack.peek());
    }
}

class ArrayStack {
    int top = -1;
    int size;
    int[] arr;

    public ArrayStack(int size) {
        this.size = size;
        this.arr = new int[size];
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= size;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Over Flow");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Under Flow");
            return -1;
        }
        int data = arr[top];
        top--;
        return data;
    }

    public int peek() {
        return arr[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

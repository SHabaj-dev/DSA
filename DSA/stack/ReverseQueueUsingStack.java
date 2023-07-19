package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(rev(queue));
    }

    public static Queue<Integer> rev(Queue<Integer> q) {
        Queue<Integer> revQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            revQueue.offer(stack.pop());
        }
        return revQueue;
    }
}

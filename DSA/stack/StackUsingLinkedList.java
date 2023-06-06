package stack;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.display();

        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        ll.display();

    }
}

class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;


    protected int pop(){
        if(head == null){
            System.out.println("Stack UnderFLow");
            return -1;
        }
        Node current = head;
        Node prev = current;
        while(current != null){
            prev = current;
            current = current.next;
        }
        prev = null;
        return current.data;

    }

    protected void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        // reverseList();
        Node current = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    // public void reverseList(){
    //     Node current = head;
    //     Node temp = null;
    //     Node prev = null;

    //     while(current != null){
    //         temp = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = temp;
    //     }
    //     head = prev;

    // }
}

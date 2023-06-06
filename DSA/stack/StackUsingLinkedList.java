package stack;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
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

    public void push(int data) {
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
        Node current = reverseList();
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

    public Node reverseList(){
        Node current = head;
        Node temp = null;
        Node prev = null;

        while(current != null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        
        return prev;
    }
}

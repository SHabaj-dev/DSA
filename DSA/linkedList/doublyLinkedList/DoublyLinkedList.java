package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private static int size = 0;

    protected void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        newNode.prev = head;
        size++;
    }

    protected void displayList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    protected void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null) {
            insertAtBegin(data);
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        newNode.prev = currentNode;
        size++;
    }

    protected void insertionAtPosition(int data, int position) {
        if (position > size) {
            System.out.println("Index Range out of bound.");
            return;
        }
        int currentPos = 1;
        if (position == 0) {
            insertAtBegin(data);
        }
        if (position == size + 1) {
            insertAtLast(data);
        }
        Node newNode = new Node(data);
        Node currentNode = head;

        while (position != currentPos) {
            currentNode = currentNode.next;
            currentPos++;
        }

        newNode.next = currentNode.next;
        newNode.prev = currentNode;
        currentNode.next.prev = newNode;
        currentNode.next = newNode;
        size++;
    }


    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}

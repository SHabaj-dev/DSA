package linkedList.singlyLinkedList;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void insertionAtLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            insertAtBegin(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void insertionAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBegin(data);
            return;
        }
        if (position == size) {
            insertionAtLast(data);
        }
        int currentPosition = 1;
        Node newNode = new Node(data);
        Node temp = head;

        while (currentPosition != position) {
            temp = temp.next;
            currentPosition++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;
        head = temp.next;
        temp = null;
        size--;

    }

    public void deleteLast() {
        Node current = head;
        if (head == tail) {
            System.out.println("List is Empty");
            return;
        }
        while (current.next.next != null) {
            current = current.next;
        }

        tail = current;
        tail.next = null;
        size--;
    }

    public void deleteAtPosition(int position) {
        int currentPos = 1;
        Node currentNode = head;
        if (position == 0) {
            deleteFirst();
        }
        if (position == size) {
            deleteLast();
        }
        while (position != currentPos) {
            currentNode = currentNode.next;
            currentPos++;
        }

        currentNode.next = currentNode.next.next;
        size--;


    }


    public void deleteKey(int key) {
        Node currentNode = head;
        int index = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            index++;
            if (currentNode.data == key) {
                System.out.println("Key found at index: " + index);
                deleteAtPosition(index);
                return;
            }

        }
        System.out.println("Key not found!");
    }

    public void deleteNPosFromLast(int position) {
    }


}

package linkedList.doublyLinkedList;

import linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int choice, data, position;
        while (true) {
            System.out.println("Please Select Any Option: ");
            System.out.println("1. Insertion At Beginning");
            System.out.println("2. Display List");
            System.out.println("3. Insertion At Last");
            System.out.println("4. Insert at Position");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Please enter the data: ");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                }
                case 2 -> {
                    list.displayList();
                }
                case 3 -> {
                    System.out.println("Please enter the data: ");
                    data = sc.nextInt();
                    list.insertAtLast(data);
                }
                case 4 -> {
                    System.out.println("Please enter the position.");
                    position = sc.nextInt();
                    System.out.println("Please enter the data.");
                    data = sc.nextInt();
                    list.insertionAtPosition(data, position);
                }
            }
        }
    }
}


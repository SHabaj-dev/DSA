package linkedList.singlyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice, data, position;

        while (true) {
            System.out.println("Please Select Any Option: ");
            System.out.println("1. Insertion At Beginning");
            System.out.println("2. Display List");
            System.out.println("3. Insert At Last.");
            System.out.println("4. Size of List");
            System.out.println("5. Insertion At Position");
            System.out.println("6. Delete First");
            System.out.println("7. Delete Last");
            System.out.println("8. Delete At Position");
            System.out.println("9. Delete a Key");
            System.out.println("10. Delete Nth from last");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Insert the Data: ");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                }
                case 2 -> {
                    System.out.println("List is: ");
                    list.printList();
                }
                case 3 -> {
                    System.out.println("Insert the Data: ");
                    data = sc.nextInt();
                    list.insertionAtLast(data);
                }
                case 4 -> {
                    System.out.println("length :" + list.size());
                }
                case 5 -> {
                    System.out.println("Enter the Position: ");
                    position = sc.nextInt();
                    System.out.println("Enter Data: ");
                    data = sc.nextInt();
                    list.insertionAtPosition(data, position);
                }
                case 6 -> {
                    list.deleteFirst();
                }
                case 7 -> {
                    list.deleteLast();
                }
                case 8 -> {
                    System.out.println("Enter the position :");
                    position = sc.nextInt();
                    list.deleteAtPosition(position);
                }
                case 9 ->{
                    System.out.println("Enter the Key :");
                    int key = sc.nextInt();
                    list.deleteKey(key);
                }
                case 10 ->{
                    System.out.println("Enter the N Position :");
                    position = sc.nextInt();
                    list.deleteNPosFromLast(position);
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        }
    }
}

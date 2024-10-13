package LinkedList;

class Node {
    int data;
    Node next = null;

    public Node(int val) {
        data = val;
    }
}

public class LinkedList {

    Node head = null;
    Node tail = null;

    public LinkedList() {

    }

    public void createList(int arr[], int length) {
        if (head != null) {
            System.out.println("List already created");
            return;
        } else {
            Node temp = new Node(arr[0]);
            head = temp;
            tail = temp;
            for (int i = 1; i < length; i++) {
                temp = new Node(arr[i]);
                tail.next = temp;
                tail = temp;

            }
        }
    }

    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            // insertAtEnd(n);
            head = temp;
            tail = head;
        } else {
            temp.next = head;
            head = temp;
        }

    }

    public int size() {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.insertAtEnd(2);
        // ll.insertAtEnd(5);
        int arr[] = { 2, 4, 6, 8 };
        int length = 4;
        ll.createList(arr, length);
        ll.insertAtEnd(10);

        // ll.display();
        ll.insertAtHead(1);
        ll.display();

        ll.insertAtEnd(11);
        ll.insertAtHead(111);
        ll.display();

        LinkedList ll2 = new LinkedList();
        ll2.insertAtHead(1);
        ll2.insertAtEnd(2);
        // ll2.createList(arr, n);
        ll2.display();

    }

}

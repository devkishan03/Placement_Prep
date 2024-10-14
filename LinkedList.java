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
    int size = 0;

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
            size++;
            for (int i = 1; i < length; i++) {
                temp = new Node(arr[i]);
                tail.next = temp;
                tail = temp;
                size++;
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
        size++;
    }

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            // insertAtEnd(n);
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insertAt(int index, int val) {
        Node t = new Node(val);
        if (head == null && index > 0) {
            System.out.println("List is empty");
            return;
        } else if (index < 0) {
            System.out.println("Index will be positive");
            return;
        } else if (index > size()) {
            System.out.println("Index out of bound");
            return;
        } else if (index == 0) {
            insertAtHead(val);
            return;
        } else if (size() == index) {
            insertAtEnd(val);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    public int getAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (index == 0) {
            return head.data;
        } else if (index >= size()) {
            System.out.println("Index out of bound");
            return -1;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int size() {
        // int i = 0;
        // Node temp = head;
        // while (temp != null) {
        // i++;
        // temp = temp.next;
        // }
        // return i;
        return size;
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
        // ll.display();

        ll.insertAtEnd(11);
        ll.insertAtHead(111);
        // ll.display();

        // LinkedList ll2 = new LinkedList();
        // ll2.insertAtHead(1);
        // ll2.insertAtEnd(2);
        // // ll2.createList(arr, n);
        // ll2.display();
        ll.insertAt(0, 21);
        // ll2.insertAtHead(2);
        // ll2.insertAt(1, 1);
        // ll.display();
        // ll2.display();
        // ll2.insertAt(3, 3);
        // System.out.println(ll2.tail.data);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.getAt(8));
    }

}

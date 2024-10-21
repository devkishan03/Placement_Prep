package LinkList2;

class Node {
    public int data;
    public Node next;
    public Node previous;

    public Node(int val) {
        data = val;
    }
}

public class DubleeLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public DubleeLinkedList() {

    }

    public DubleeLinkedList(int arr[], int n) {
        Node temp = new Node(arr[0]);
        head = temp;
        tail = head;
        size++;
        for (int i = 1; i < n; i++) {
            temp = new Node(arr[i]);
            temp.previous = tail;
            tail.next = temp;
            tail = temp;
            size++;
        }

    }

    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head != null) {
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        } else {
            head = tail = temp;
        }
        size++;
    }

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head != null) {
            head.previous = temp;
            temp.next = head;
            head = temp;
        } else {
            head = tail = temp;
        }
        size++;
    }

    public void deleteHead() {
        if (head == null) {
            return;
        }
        if (head.next != null) {
            Node temp = head;
            temp.next.previous = null;
            head = temp.next;
            temp = null;
        } else {
            head = tail = null;
        }
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverseDisplay() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

    public void deleteEnd() {
        if (tail == null) {
            return;
        }
        if (tail.previous != null) {
            tail = tail.previous;
            tail.next = null;
        } else {
            head = tail = null;
        }
        size--;
    }

    public void insertAt(int index, int val) {
        if (index < 0 | index > size) {
            System.out.println("index out of bound");
            return;
        }
        if (head == null && index > 0) {
            System.out.println("list is empty");
            return;
        }
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        if (index == size) {
            insertAtEnd(val);
            return;
        } else {
            Node temp = head;
            Node temp2 = new Node(val);
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp2.next = temp.next;
            temp2.previous = temp;
            temp.next.previous = temp2;
            temp.next = temp2;
            size++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        DubleeLinkedList dl = new DubleeLinkedList(arr, n);
        // dl.display();
        // dl.insertAtEnd(10);
        // dl.insertAtHead(11);
        // dl.reverseDisplay();
        // System.out.println(dl.size);
        DubleeLinkedList dl2 = new DubleeLinkedList();
        dl2.insertAtEnd(10);

        dl2.insertAtHead(11);
        dl2.display();
        System.out.println(dl2.size);
        dl2.deleteHead();
        dl2.display();
        // System.out.println(dl2.head.previous.data);
        System.out.println(dl2.head.previous);
        System.out.println(dl2.size);
        dl2.display();
        // dl2.deleteHead();
        // dl2.deleteEnd();
        dl2.display();
        dl2.insertAt(0, 13);
        dl2.display();
        System.out.println(dl2.head.data);
        dl.display();
        // System.out.println(dl.size);
        dl.insertAt(0, 10);
        dl.display();
    }
}

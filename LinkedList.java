package LinkedList;

import java.io.FileReader;

class Node {
    int data;
    Node next = null;

    public Node(int val) {
        data = val;
    }
}

public class LinkedList {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

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

    public int maxElement() {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public int minElement() {
        int min = Integer.MAX_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min)
                min = temp.data;
            temp = temp.next;
        }
        return min;
    }

    public String searchElement(int val) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return val + " found in " + count + " index";
            }
            temp = temp.next;
            count++;
        }
        return val + " not found in the List";
    }

    public Node searchElement2(int val) {
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            if (temp.data == val) {
                previous.next = temp.next;
                temp.next = head;
                head = temp;
                return temp;
            }
            previous = temp;
            temp = temp.next;

        }
        return null;
    }

    public void deleteByElement(int val) {
        Node temp = head;
        Node previous = null;
        if (head.data == val) {
            temp = head.next;
            head = temp;
            temp = null;
            size--;
            return;
        }
        while (temp != null) {
            if (temp.data == val && temp.next == null) {
                previous.next = null;
                tail = previous;
                temp = null;
                size--;
                return;
            }
            if (temp.data == val) {
                previous.next = temp.next;
                temp = null;
                size--;
                return;
            }
            previous = temp;
            temp = temp.next;

        }
    }

    public void deleteByIndex(int index) {
        Node temp = head;
        if (index >= size) {
            System.out.println("index out of bound");
            return;
        }
        if (index == 0) {
            temp = temp.next;
            head = temp;
            temp = null;
            size--;
            return;
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next.next == null) {
            temp.next = temp.next.next;
            tail = temp;
            size--;
            return;
        }
        temp.next = temp.next.next;
        size--;
    }

    public boolean isSorted() {
        Node temp = head;
        int tempval = Integer.MIN_VALUE;
        while (temp != null) {
            if (temp.data < tempval) {
                return false;
            }
            tempval = temp.data;
            temp = temp.next;
        }
        return true;
    }

    public void removeDuplicates_Sorted() {
        Node current = head;
        Node next = head.next;
        while (next != null) {
            if (current.data != next.data) {
                current = next;
                next = next.next;
            } else {
                current.next = next.next;
                next = current.next;
            }

        }
    }

    public void reverseByElement() {
        int arr[] = new int[size];
        Node temp = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }
        temp = head;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp.data = arr[i];
            temp = temp.next;
        }
    }

    public void reverseByNode() {
        Node current = head;
        Node prev = null;
        Node prev2 = null;
        while (current != null) {
            prev2 = prev;
            prev = current;
            current = current.next;
            prev.next = prev2;
        }
        head = prev;
    }

    private void reverse(Node p, Node q) {
        if (p != null) {
            reverse(p.next, p);
            p.next = q;
        } else {
            head = q;
        }
    }

    public void recursiveReverse() {
        Node p = head;
        Node q = null;
        reverse(p, q);

    }

    public void concat(Node second) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = second;
    }

    public void margeWith(Node other) {
        Node first = head;
        Node second = other;
        Node newlist = null;
        Node last = null;
        if (first.data < second.data) {
            newlist = first;
            last = first;
            first = first.next;
        } else {
            newlist = second;
            last = second;
            second = second.next;
        }
        while (first != null && second != null) {
            if (first.data < second.data) {
                last.next = first;
                last = first;
                first = first.next;
            } else if (first.data >= second.data) {
                last.next = second;
                last = second;
                second = second.next;
            }
        }
        while (first != null) {
            last.next = first;
            last = first;
            first = first.next;

        }
        while (second != null) {
            last.next = second;
            last = second;
            second = second.next;

        }
        head = newlist;

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
        // int arr[] = { 2, 4, 6, 8 };
        // int length = 4;
        // ll.createList(arr, length);
        // ll.insertAtEnd(10);

        // ll.display();
        // ll.insertAtHead(1);
        // ll.display();

        // ll.insertAtEnd(11);
        // ll.insertAtHead(111);
        // ll.display();

        LinkedList ll2 = new LinkedList();
        ll2.insertAtHead(1);
        ll2.insertAtEnd(3);
        ll2.insertAtEnd(5);
        ll2.insertAtEnd(6);
        // // ll2.createList(arr, n);
        // ll2.display();
        // ll.insertAt(0, 21);
        // ll2.insertAtHead(2);
        // ll2.insertAt(1, 1);
        // ll.display();
        // ll2.display();
        // ll2.insertAt(3, 3);
        // System.out.println(ll2.tail.data);
        // ll.display();
        // System.out.println(ll.size());
        // System.out.println(ll.getAt(8));
        // System.out.println(ll.maxElement());
        // System.out.println(ll.minElement());
        // System.out.println(ll.searchElement2(1).data);
        // ll.deleteByElement(21);
        // ll.deleteByIndex(8);
        // ll.display();
        // System.out.println(ll.tail.data);
        int arr[] = { 0, 2, 4, 7, 8, 9 };
        int n = 6;
        ll.createList(arr, n);
        ll.display();
        // System.out.println(ll.size);
        // ll.removeDuplicates_Sorted();
        // ll.reverseByElement();
        // ll.display();
        // ll.reverseByNode();
        // ll.recursiveReverse();
        ll2.display();
        ll.margeWith(ll2.head);
        ll.display();
        // System.out.println(ll.isSorted());
    }

}

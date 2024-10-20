package LinkedList;

class DNode {
    int data;
    DNode next;
    DNode previous;

    public DNode(int val) {
        data = val;
    }

}

public class DubleeLinkedList {
    DNode head = null;
    DNode tail = null;
    int size = 0;

    public DubleeLinkedList() {

    }

    public DubleeLinkedList(int arr[], int n) {

        DNode temp = new DNode(arr[0]);
        head = temp;
        tail = head;
        size++;
        for (int i = 1; i < n; i++) {
            temp = new DNode(arr[i]);
            temp.next = tail.next;
            temp.previous = tail;
            tail.next = temp;
            tail = temp;
            size++;
        }

    }

    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverseDisplay() {
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;
        DubleeLinkedList d = new DubleeLinkedList(arr, n);
        d.display();
        d.reverseDisplay();

    }
}

package Queue;

class Node {
    public Node next;
    public int data;

    public Node(int val) {
        data = val;
    }
}

public class QueueusingLinkedlist {
    public Node head;
    public Node tail;
    private int size = 0;

    public QueueusingLinkedlist() {

    }

    public void equeue(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int dequeue() {
        int x = -1;
        if (head != null) {
            x = head.data;
            head = head.next;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return x;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {
        QueueusingLinkedlist qu = new QueueusingLinkedlist();
        qu.equeue(1);
        qu.equeue(2);
        System.out.println(qu.size());

        qu.display();
        qu.dequeue();
        qu.display();
    }
}

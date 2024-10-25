package Stacksinglelinklist;

class Node {
    public Node next;
    public int data;

    public Node(int val) {
        data = val;
    }
}

public class Stackusingsingle {

    public Node head;
    private int index = -1;

    public Stackusingsingle() {

    }

    public void push(int val) {
        Node temp = new Node(val);
        if (temp != null) {
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            index++;
        }

    }

    public int pop() {
        int x = -1;

        if (head != null && index != -1) {
            x = head.data;
            head = head.next;
            index--;
        } else {
            System.out.println("stack underflow");
        }

        return x;
    }

    public int peek(int position) {
        if (position > 0 && position - 1 <= index) {
            Node temp = head;
            for (int i = 1; temp != null && i < position; i++) {
                temp = temp.next;
            }
            return temp.data;
        } else {
            System.out.println("invalid position");
            return -1;
        }

    }

    public int StackTop() {
        if (head == null) {
            System.out.println("stack empty");
            return -1;
        }
        int x = head.data;
        return x;
    }

    public int size() {
        return index + 1;
    }

    public void display() {
        if (head == null) {
            System.out.println("Stack empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stackusingsingle st = new Stackusingsingle();
        // st.push(2);
        // st.push(3);
        // st.display();
        // st.pop();
        // st.display();
        // st.pop();
        // st.display();
        // st.pop();
        for (int i = 0; i < 10; i++) {
            st.push(i);
        }
        st.display();
        System.out.println(st.peek(5));
        System.out.println(st.StackTop());

    }

}

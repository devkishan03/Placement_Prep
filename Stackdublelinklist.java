package Stackusinglinklist;

class Node {
    Node next;
    Node previous;
    int data;

    public Node(int val) {
        data = val;
    }
}

public class Stackdublelinklist {
    private Node head, tail;
    private int index = -1;
    private int size;

    public Stackdublelinklist(int size) {
        this.size = size - 1;
    }

    public void push(int val) {
        if (index < size) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;

            } else {
                tail.next = temp;
                temp.previous = tail;
                tail = temp;
            }
            index++;
        } else {
            System.out.println("stack full");
        }

    }

    public void push(int vals[]) {
        if (size - index >= vals.length) {
            for (int i = 0; i < vals.length; i++) {
                push(vals[i]);
            }
        } else {
            System.out.println("Not enough space in stack");
        }
    }

    public int pop() {
        int x = -1;
        if (index >= 0) {
            if (index != 0) {
                tail = tail.previous;
                tail.next = null;
                x = tail.data;
            } else {
                x = tail.data;
                tail = head = null;
            }
            index--;
        } else {
            System.out.println("stack underflow");
        }
        return x;
    }

    public int noofElement() {
        return index + 1;
    }

    public int stackTop() {
        int x = -1;
        if (index >= 0) {
            x = tail.data;
        } else {
            System.out.println("stack underflow");
        }
        return x;
    }

    public int peek(int position) {
        int x = -1;
        if (position < 1 || position > size + 1) {
            System.out.println("invalid position");
        } else {
            Node temp = tail;
            for (int i = 1; i < position; i++) {
                temp = temp.previous;
            }
            x = temp.data;
        }
        return x;
    }

    public void display() {
        if (head != null) {
            Node temp = tail;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.previous;
            }

        } else {
            System.out.println("stack is empty");
        }
    }

    public static void main(String[] args) {
        Stackdublelinklist stk = new Stackdublelinklist(10);
        stk.push(1);
        stk.push(2);
        for (int i = 0; i < 8; i++) {
            stk.push(i + 3);
        }
        // stk.display();
        // stk.pop();
        // stk.pop();
        // System.out.println(stk.pop());
        // stk.display();
        // System.out.println(stk.noofElement());
        // System.out.println(stk.stackTop());
        // System.out.println(stk.peek(7));
        for (int i = 0; i < 10; i++) {
            stk.pop();
        }
        System.out.println(stk.noofElement());
        stk.display();
    }
}

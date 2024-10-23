package Stack;

public class Stackclass {
    public int data[];
    public int size = 0;
    private int index = -1;

    public Stackclass(int size) {
        data = new int[size];
        this.size = size - 1;
    }

    public void push(int val) {
        if (index < size)
            data[++index] = val;
        else
            System.out.println("stack is full");
    }

    public void push(int values[]) {
        if (size - (index + 1) >= values.length - 1) {
            for (int i = 0; i < values.length; i++) {
                push(values[i]);
            }
        } else {
            System.out.println("Not enough space in stack");
        }
    }

    public int pop() {
        if (index > -1)
            return data[index--];
        else {
            System.out.println("Stack is empty");
            return -1;
        }

    }

    public int peek(int index) {
        if (index > size || index < 1) {
            System.out.println("index out of bound");
            return -1;
        }
        if (index > this.index + 1) {
            System.out.println("index is empty");
            return -1;
        }
        return data[this.index - index + 1];
    }

    public int stackTop() {
        return data[index];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == size;
    }

    public int numofElements() {
        return index + 1;
    }

    public void display() {
        for (int i = index; i >= 0; i--) {
            System.out.println(data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stackclass stk = new Stackclass(10);
        stk.push(1);
        // stk.push(11);
        int arr[] = { 2, 4, 5, 6, 7, 8, 9, 10, 12 };
        stk.push(arr);
        // stk.push(100);
        // stk.display();
        // System.out.println(stk.stackTop());
        stk.pop();
        // stk.display();
        //
        stk.push(111);
        // stk.display();
        // System.out.println(stk.numofElements());
        // System.out.println(stk.isFull());
        // for (int i = 0; i < 10; i++) {
        // stk.pop();
        // }
        // System.out.println(stk.numofElements());
        // stk.push(1111);
        // System.out.println(stk.pop());
        // System.out.println(stk.isEmpty());
        // System.out.println(stk.isFull());
        stk.pop();
        stk.pop();
        stk.display();

        System.out.println(stk.peek(2));

    }
}

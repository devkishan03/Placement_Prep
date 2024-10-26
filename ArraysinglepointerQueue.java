package Queue;

public class ArraysinglepointerQueue {
    private int arr[];
    private int index = -1;
    private int size = 0;

    public ArraysinglepointerQueue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void enqueue(int val) {
        if (index < size - 1) {
            arr[++index] = val;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        int x = -1;
        if (index != -1) {
            x = arr[0];
            for (int i = 0; i < index; i++) {
                arr[i] = arr[i + 1];
            }
            index--;
        } else {
            System.out.println("Queue is empty");
        }
        return x;
    }

    public int getSize() {
        return size;
    }

    public int noOfElements() {
        return index + 1;
    }

    public boolean isempty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == size - 1;
    }

    public void display() {
        if (index == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArraysinglepointerQueue ue = new ArraysinglepointerQueue(10);
        ue.enqueue(1);
        ue.enqueue(2);
        System.out.println(ue.noOfElements());
        ue.display();
        ue.dequeue();
        ue.display();
        System.out.println(ue.noOfElements());
        for (int i = 0; i < 9; i++) {
            ue.enqueue(i + 2);
        }
        ue.display();
        for (int i = 0; i < 9; i++) {
            ue.dequeue();
        }
        ue.display();
        System.out.println(ue.dequeue());

        System.out.println(ue.noOfElements());

    }
}

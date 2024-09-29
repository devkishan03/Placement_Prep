package Sorting;

public class BubbleShort {
    public static void bShort(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 6, 7, 8, 1 };
        bShort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}

package Sorting;

public class SelectionShort {
    public static void sShort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 6, 8, 9 };
        sShort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

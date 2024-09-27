package Array_topic;

public class Rotatearray_by_k {

    public static int[] rotatebyK(int arr[], int k) {
        if (k > arr.length) {
            return arr;
        } else {
            for (int i = 0, j = k - 1; i < (k / 2); i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 7, 9, 8, 4 };
        int arr2[] = rotatebyK(arr, 4);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

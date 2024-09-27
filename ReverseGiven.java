package Array_topic;

public class ReverseGiven {

    public static int[] reverseArray(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 44, 5, 6, 7, 5, 44, 5, 6, 77, 88, 34, 56, 78, 90, 98, 767, 54, 32, 12, 34, 56, 566, 6675, 77,
                45, 456, 35, 345, 2 };
        int arr2[] = reverseArray(arr);

        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

package Array_topic;

public class Inert_Element {
    public static int[] insertBegening(int arr[], int x) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
        return arr;
    }

    public static int[] insertEnd(int arr[], int x) {
        arr[arr.length - 1] = x;
        return arr;
    }

    public static int[] insertAtIndex(int arr[], int index, int x) {
        if (index > arr.length - 1) {
            System.out.println("index should be less then:" + arr.length);
        } else if (index == arr.length - 1) {
            arr[index] = x;

        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;

        }
        return arr;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 5, 67, 8, 9, 7, 5, 0, 0, 0 };
        int arr[] = { 2, 3, 5, 67, 8, 9, 7, 5, 0 };
        int arr2[] = insertAtIndex(arr, 6, 1);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

package Array_topic;

public class RemovingDuplicates_Sortedarray {
    public static int[] removeDuplicates(int arr[]) {
        int pointer = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[pointer++] = arr[i];
            }
        }
        while (pointer < arr.length) {
            arr[pointer++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 7 };
        int arr2[] = removeDuplicates(arr);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

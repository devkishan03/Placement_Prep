package Array_topic;

public class RemoveDuplicates_Unsortedarry {
    public static int[] removeDuplicatesUnsorted(int arr[]) {
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        arr[j] = 0;
                        count--;
                    }
                }
            }
        }
        int arr2[] = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[index++] = arr[i];
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 7, 1, 2, 4, 6, 5, 1 };
        int arr2[] = removeDuplicatesUnsorted(arr);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

package Array_topic;

public class Rearrange_Inc_Dec_order {
    public static int[] rearrangeOrder(int arr[]) {
        int index = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for (int i = index, j = arr.length - 1; i < (index + arr.length) / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 7, 9, 8, 4 };
        int arr2[] = rearrangeOrder(arr);
        for (int i : arr2) {
            System.out.println(i);
        }
    }

}

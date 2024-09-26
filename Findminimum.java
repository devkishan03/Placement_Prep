package Array_topic;

public class Findminimum {
    public static int minElement(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int maxElement(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 44, 5, 6, 7, 5, 44, 5, 6, 77, 88, 34, 56, 78, 90, 98, 767, 54, 32, 12, 34, 56, 566, 6675, 77,
                45, 456, 35, 345, 2 };
        // System.out.println(minElement(arr));
        System.out.println(maxElement(arr));
    }
}

package Array_topic;

public class SecondLargeSmall {

    public static int secondSmallestElement(int arr[]) {
        int min = arr[0];
        int min2nd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min2nd = min;
                min = arr[i];
            } else if (arr[i] > min && min2nd > arr[i]) {
                min2nd = arr[i];
            }
        }
        return min2nd;
    }

    public static int secondHiestElement(int arr[]) {
        int max = arr[0];
        int max2nd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2nd = max;
                max = arr[i];
            } else if (arr[i] > max2nd && max > arr[i]) {
                max2nd = arr[i];
            }
        }
        return max2nd;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 5, 44, 5, 6, 77, 88, 34, 56, 78, 90, 98, 767, 54, 32, 12, 34, 56, 566, 6675, 7788,
                45, 456, 35, 345, 2 };
        // System.out.println(secondSmallestElement(arr));
        System.out.println(secondHiestElement(arr));
    }
}

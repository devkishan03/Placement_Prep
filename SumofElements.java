package Array_topic;

public class SumofElements {

    public static int sumofElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 7, 9, 8, 4 };
        System.out.println(sumofElements(arr));
    }
}

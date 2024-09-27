package Array_topic;

public class AvgofElements {
    public static double getAvg(int arr[]) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return avg / (arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 7, 9, 8, 4 };
        System.out.println(getAvg(arr));
    }
}

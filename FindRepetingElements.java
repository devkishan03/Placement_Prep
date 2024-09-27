package Array_topic;

public class FindRepetingElements {
    public static void findRepeting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        arr[j] = -1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1, 3, 5, 6, 7, 5 };
        findRepeting(arr);
    }
}

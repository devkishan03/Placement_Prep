package Array_topic;

public class FindNonRepetingElement {
    public static void findNonRepeting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        flag = false;
                        arr[j] = -1;
                    }
                }
                if (flag) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1, 3, 5, 6, 7, 5 };
        findNonRepeting(arr);
    }
}

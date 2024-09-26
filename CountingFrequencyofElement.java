package Array_topic;

public class CountingFrequencyofElement {
    public static void countFrequency(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (visited[j] != true) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
            }
            if (visited[i] != true)
                System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 3, 5, 4, 5, 6, 1, 6, 7, 4, 8 };
        countFrequency(arr);
    }
}
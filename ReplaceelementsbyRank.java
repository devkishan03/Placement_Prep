package Array_topic;

public class ReplaceelementsbyRank {

    public static int[] replaceByRank(int arr[]) {
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    rank++;
                }
            }
            arr2[i] = rank;

        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 6, 7, 8, 1 };
        int arr2[] = replaceByRank(arr);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

}

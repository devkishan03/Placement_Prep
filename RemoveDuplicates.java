public class RemoveDuplicates {
    public static void removeDuplicates(String str) {
        int arr[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != 1) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
                        arr[j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.print(str.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        String str = "my name is kishan";
        removeDuplicates(str);
    }
}

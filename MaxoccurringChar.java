public class MaxoccurringChar {
    public static void findMaxoccurechar(String str) {
        str = str.replaceAll(" ", "");
        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.toLowerCase().charAt(i)]++;
        }

        int max = 0;
        int max2 = 0;
        char highest = ' ', high2 = ' ';
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                highest = (char) i;
            } else if (max == arr[i]) {
                max2 = arr[i];
                high2 = (char) i;
            }

        }
        if (max != max2) {
            System.out.println("highest occurring char is:" + highest);
        } else {
            System.out.println("highest occurring char's are: " + highest + " , " + high2);
        }
    }

    public static void main(String[] args) {
        String str = "hi my name is kishan singh m m";
        findMaxoccurechar(str);
    }
}
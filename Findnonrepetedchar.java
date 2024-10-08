public class Findnonrepetedchar {

    public static void findNonRepetChar(String str) {
        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.toLowerCase().charAt(i)]++;
        }
        System.out.println("non repeting characters:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "hi my name is kishan";
        findNonRepetChar(str);
    }
}

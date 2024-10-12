public class FindLargestword {
    public static void findLeargestString(String str) {
        String str2[] = str.split(" ");
        int n = str2[0].length();
        int index = 0;
        for (int i = 1; i < str2.length; i++) {
            if (n < str2[i].length()) {
                n = str2[i].length();
                index = i;
            }
        }
        System.out.println("Leargest word:" + str2[index]);
    }

    public static void main(String[] args) {
        String str = "hi my name is kishan singh";
        findLeargestString(str);
    }
}

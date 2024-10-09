public class Removecharfrom_Firststr {
    public static void removecharFromfirst(String str1, String str2) {
        int arr[] = new int[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j) && str1.charAt(i) != ' ') {
                    arr[i] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.print(str1.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "hi my name is kishan";
        String str2 = "ik";
        removecharFromfirst(str, str2);
    }
}

public class ExtractDuplicates {
    public static void extractDuplicates(String str) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
                    flag = true;
                }
            }
            if (flag) {
                sb.append(str.charAt(i));
            }
            flag = false;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "my name is kishan";
        extractDuplicates(str);
    }
}

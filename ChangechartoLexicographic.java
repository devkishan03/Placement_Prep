public class ChangechartoLexicographic {
    public static void changeLexoChar(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(' ');
            } else if (str.charAt(i) >= 'a' && 'y' >= str.charAt(i) || str.charAt(i) >= 'A' && 'Y' >= str.charAt(i)) {
                int a = str.charAt(i) + 1;
                sb.append((char) a);
            } else if (str.charAt(i) == 'z') {
                sb.append('a');
            } else if (str.charAt(i) == 'Z') {
                sb.append('A');
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "hi my name is kishan zZ";
        String str2 = "a quick brown fox jumps over the leazy dog";
        String str3 = "A QUICK BROWN FOX JUMPS OVER THE LEAZY DOG";
        changeLexoChar(str);
        changeLexoChar(str2);
        changeLexoChar(str3);
    }
}

public class RemoveVoual {
    public static String removeVoual(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;

    }

    public static String removeVoual2(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");

    }

    public static boolean isContainVoual(String str) {
        return str.matches(".*[aeiouAEIOU].*");
    }

    public static String removeBrackets(String str) {
        return str.replaceAll("[(){}\\[\\]]", "");
    }

    public static void main(String[] args) {
        String str = "kaeiolu";
        String str2 = "kishn";
        String str3 = "(a+b)+c{2+3}[]";
        // System.out.println(removeVoual2(str));
        // System.out.println(isContainVoual(str2));
        System.out.println(removeBrackets(str3));
    }
}

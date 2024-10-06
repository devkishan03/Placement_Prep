public class SumofDigits {
    public static int sumofDig(String str) {
        int sum = 0;
        String tempsum = "0";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                tempsum += c;
            } else {
                sum += Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        return sum += Integer.parseInt(tempsum);
    }

    public static void main(String[] args) {
        String str = "1kud2k7";
        System.out.println(sumofDig(str));
    }
}

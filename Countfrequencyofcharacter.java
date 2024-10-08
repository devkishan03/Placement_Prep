public class Countfrequencyofcharacter {

    public static void countFrequencyofchar(String str) {
        char arr[] = str.toCharArray();
        int count[] = new int[256];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println((char) i + ":" + count[i]);
            }

        }
    }

    public static void main(String[] args) {
        String str = "mmmmkkkkaaaiiijl";
        countFrequencyofchar(str);
    }
}

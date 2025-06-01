public class RecursionPractice {

    public static void count(int i) {
        if (i == 6)
            return;
        System.out.println(i++);
        count(i);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printRecursion(int i) {
        if (i > 0) {
            System.out.println("before printing " + i);
            printRecursion(i - 1);
            System.out.println("after printing " + i);
        }
    }

    public static void decimalToBinary(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int n = decimal % 2;
            sb.append(n);
            decimal = decimal / 2;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void decimalToOctal(int decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int n = decimal % 8;
            sb.append(n);
            decimal = decimal / 8;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // count(1);
        // System.out.println(factorial(5));
        // printRecursion(5);
        // decimalToBinary(125);
        decimalToOctal(256);
    }
}
public class PrimeFactors {
    public static void findPrimeFactor(int n) {
        int count = 0;
        System.out.print("Prime factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("total factors:" + count);
    }

    public static void main(String[] args) {
        int n = 3600;
        findPrimeFactor(n);
    }
}

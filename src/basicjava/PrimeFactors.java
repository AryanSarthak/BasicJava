package basicjava;

public class PrimeFactors {
    int n;
    PrimeFactors(int n) {
        this.n = n;
    }
    public void findPrimeFactors() {
        System.out.println("Prime factors of " + n + " are: ");
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if (n > 1) System.out.println(n);
    }
}

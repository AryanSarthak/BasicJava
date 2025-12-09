package basicjava;

public class HarmonicNumber {
    int N;
    HarmonicNumber(int N) {
        this.N = N;
    }
    public void findHarmonicNumber() {

        if (N == 0) {
            System.out.println("N cannot be zero!");
            return;
        }

        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Harmonic Value = " + sum);
    }
}

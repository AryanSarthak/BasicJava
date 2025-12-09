package basicjava;

public class PowerOfTwo {
    int n;
    PowerOfTwo(int n) {
        this.n = n;
    }

    public void PrintPowerOfTwo() {
        if (n < 0 || n >= 31) {
            System.out.println("Enter N between 0 and 30");
            return;
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("2 to the power " + i + " = " + (int) Math.pow(2, i));
        }
    }
}

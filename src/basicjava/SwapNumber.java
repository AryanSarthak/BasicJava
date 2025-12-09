package basicjava;

public class SwapNumber {
    int a;
    int b;
    SwapNumber(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void swapNum() {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped no: " + a + " " + b );
    }
}

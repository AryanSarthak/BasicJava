package basicjava;

public class ParityCheck {
    int n;
    public ParityCheck(int n) {
        this.n = n;
    }
    public void checkParity() {
        System.out.println(n%2==0?"Even":"Odd");
    }
}

package basicjava;

public class QuotientRemainder {
    int a,b;
    QuotientRemainder(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void findQuotientRemainder() {
        System.out.println("Quotient: " + a/b + " Remainder: " + a%b );
    }
}

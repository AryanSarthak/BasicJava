package basicjava;

public class LargestAmongThreeNums {
    int a;
    int b;
    int c;
    LargestAmongThreeNums(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findLargest() {
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        System.out.println("Maximum no is: " + max );
    }
}

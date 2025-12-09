package basicjava;

public class FlipCoin {
     int n;
     public FlipCoin(int n) {
        this.n = n;
     }
    public void findPercentage() {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5)
                heads++;
        }

        double headPercent = (heads * 100.0) / n;
        double tailPercent = 100 - headPercent;

        System.out.println("Heads: " + headPercent + "%");
        System.out.println("Tails: " + tailPercent + "%");
    }
}

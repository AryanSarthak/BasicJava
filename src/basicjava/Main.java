package basicjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FlipCoin obj = new FlipCoin(n);
        obj.findPercentage();
        int year = sc.nextInt();
        LeapYear yearObj = new LeapYear(year);
        yearObj.isLeapYear();
        sc.close();
    }
}

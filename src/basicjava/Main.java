package basicjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin:");
        FlipCoin obj = new FlipCoin(sc.nextInt());
        obj.findPercentage();

        System.out.println("Enter the year:");
        LeapYear yearObj = new LeapYear(sc.nextInt());
        yearObj.isLeapYear();

        System.out.println("Enter the power of two:");
        PowerOfTwo powObj = new PowerOfTwo(sc.nextInt());
        powObj.PrintPowerOfTwo();

        System.out.println("Enter the harmonic number:");
        HarmonicNumber hnOnj = new HarmonicNumber(sc.nextInt());
        hnOnj.findHarmonicNumber();

        System.out.println("Enter the number to find prime factors:");
        PrimeFactors pfObj = new PrimeFactors(sc.nextInt());
        pfObj.findPrimeFactors();

        System.out.println("Enter the Quotient and Remainder:");
        QuotientRemainder qrObj = new QuotientRemainder(sc.nextInt(),sc.nextInt());
        qrObj.findQuotientRemainder();

        System.out.println("Enter the number to swap:");
        SwapNumber swap=new SwapNumber(sc.nextInt(),sc.nextInt());
        swap.swapNum();

        System.out.println("Enter the number to check parity:");
        ParityCheck pc=new ParityCheck(sc.nextInt());
        pc.checkParity();

        System.out.println("Enter the character to check vowel or consonant:");
        VowelConsonant vc=new VowelConsonant(sc.next().charAt(0));
        vc.checkVowelConsonant();

        System.out.println("Enter the three numbers:");
        LargestAmongThreeNums l3=new LargestAmongThreeNums(sc.nextInt(),sc.nextInt(),sc.nextInt());
        l3.findLargest();
        sc.close();
    }
}

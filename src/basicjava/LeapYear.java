package basicjava;

public class LeapYear {
    int year;
    public LeapYear(int year) {
        this.year = year;
    }
    public void isLeapYear() {
        if(year < 1000 || year > 9999) {
            System.out.println("Invalid year!");
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }
}
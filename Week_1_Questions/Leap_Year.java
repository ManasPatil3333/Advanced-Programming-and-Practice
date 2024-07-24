// A Java program to help user to determine given year is a leap year or not.
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year%4 == 0 && year%100 != 0) {
            System.out.println("It's a leap year.");
        } else if(year%100 == 0 && year%400 == 0) {
            System.out.println("It's a leap year.");
        } else {
            System.out.println("It's not a leap year.");
        }
    }
}

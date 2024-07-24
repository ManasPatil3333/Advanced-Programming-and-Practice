// A Java program that ask user to enter the current temperature in celcius to categorize temperature.
import java.util.Scanner;

public class Temperature_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current temperature in celcius : ");
        int cur_temp = sc.nextInt();
        if(cur_temp > 30) {
            System.out.println("It's hot!");
        } else if (cur_temp<=30 && cur_temp>20) {
            System.out.println("It's warm.");
        } else if (cur_temp<=20 && cur_temp>10) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's cold.");
        }
    }
}

// A Java program that ask user to input principal, rate of interest and number of yesrs to calculate simple ineterest.
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal, rate, years, S_I;
        System.out.println("Enter the principal amount :");
        principal = sc.nextFloat();
        System.out.println("Enter the rate of interest : :");
        rate = sc.nextFloat();
        System.out.println("Enter the number of years :");
        years = sc.nextFloat();
        float total_Interest = 0;
        for(int i=1; i<=years; i++) {
            S_I =(principal*rate)/100;
            total_Interest += S_I;
        }
        System.out.println("Total Interest : "+total_Interest);
    }
}

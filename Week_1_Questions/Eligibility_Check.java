// A Java program that ask user to enter his/her age and check whether he/she is eligible to vote.
import java.util.Scanner;

public class Eligibility_Check {
    public static void Check_eligibility(int age) {
        if(age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your age : "); 
        int age = sc.nextInt();
        Check_eligibility(age);
    }
}

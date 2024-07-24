// A Java program that ask user to enter a number and check whether that number is odd or even.
import java.util.Scanner;

public class Number_check {
    public static void Check_number(int num) {
        if(num%2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number : "); 
        int num = sc.nextInt();
        Check_number(num);
    }
}

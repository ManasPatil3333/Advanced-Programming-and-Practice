// A Java program that help user to calculate addition or subtraction based on their choices.
// Register no. : RA2311003011682
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction.");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();
            System.out.printf("%d + %d = %d",num1, num2, num1+num2);
        } else if(choice == 2) {
            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();
            System.out.printf("%d - %d = %d",num1, num2, num1-num2);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

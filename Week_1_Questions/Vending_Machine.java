// A Java program that ask user to select choices for buying juices or soda from vending machine.
import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for juice or 2 for soda.");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Dispensing juice.");
        } else if (choice == 2) {
            System.out.println("Dispensing soda.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

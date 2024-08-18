// A java program that ask user to input the number of rows and display the pattern.
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, count = 1;
        System.out.println("Enter the number of rows : ");
        rows = sc.nextInt();
        while (rows != 0) {
            for(int i=1; i<=count; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            rows--;
            count++;
        }
    }
}

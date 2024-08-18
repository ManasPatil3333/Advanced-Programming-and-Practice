// A Java program that calculate the sum of all even number between 1 to given number.
import java.util.Scanner;
public class Sum_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, i = 2;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        do {
            if(i%2 == 0) {
                sum += i;
            }
            i++;
        } while(i!= (num+1));
    System.out.println("Sum : "+sum);
    }
    
}

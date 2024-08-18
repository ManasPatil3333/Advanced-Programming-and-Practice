import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Largest_Number {
    public static int[] fillArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for(int i=0; i<size; i++) {
            array[i] = rand.nextInt(1,100);
        }
        return array;
    }
    public static int findLargest(int[] array1, int size) {
        int largest = array1[0];
        for(int i=0; i<size; i++) {
            if(largest < array1[i]) {
                largest = array1[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] array1 = fillArray(size);
        System.out.println(Arrays.toString(array1));
        int res = findLargest(array1, size);
        System.out.println("Largest number : "+res);
    }
}

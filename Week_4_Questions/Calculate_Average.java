import java.util.Scanner;
import java.util.Arrays;

public class Calculate_Average {
    public static int[] getInputArray(int size) {
        Scanner sca = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i=0; i<size; i++) {
            array[i] = sca.nextInt();
        }
        return array;
    }
    public static int calculateAverage(int[] array1, int size) {
        int sum = 0;
        for(int i=0; i<size; i++) {
            sum += array1[i];
        }
        int average = sum/array1.length;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        array1 = getInputArray(size);
        System.out.println("Array data : ");
        System.out.println(Arrays.toString(array1));
        int res = calculateAverage(array1, size);
        System.out.println("Average number : "+res);
    }
}

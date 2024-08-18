import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class OnlineCart {
    public static int highest_Price(int[] cart_1, int size) {
        int high_Price = cart_1[0];
        for(int i=0; i<size; i++) {
            if(high_Price < cart_1[i]) {
                high_Price = cart_1[i];
            }
        }
        return high_Price;
    }
    public static int lowest_Price(int[] cart_1, int size) {
        int low_Price = cart_1[0];
        for(int i=0; i<size; i++) {
            if(cart_1[i] != 0) {
                if(low_Price > cart_1[i]) {
                    low_Price = cart_1[i];
                }
            }
        }
        return low_Price;
    }
    public static int[] removeProduct(int[] cart) {
        Scanner sca = new Scanner(System.in);
        System.out.println("How many products do u want to remove : ");
        int count = sca.nextInt();
        for(int i=0; i<count; i++) {
            System.out.println("Enter the index of product to remove it from cart : ");
            int index = sca.nextInt();
            cart[index-1] = 0;
        }
        return cart;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand  = new Random();
        System.out.println("Enter the number of products in your cart : ");
        int size = sc.nextInt();
        int[] cart = new int[size];
        int[] cart_1 = new int[size];
        int sum = 0;
        for(int i=0; i<size; i++) {
            cart[i] = rand.nextInt(1,500);
        }
        System.out.println("Prices of products in your cart : ");
        System.out.println(Arrays.toString(cart));
        System.out.println("Enter '1' to remove product from cart or Enter any key to don't remove anything : ");
        int choice = sc.nextInt();
        if(choice == 1) {
            cart_1 = removeProduct(cart);
        }
        System.out.println("Prices of products in your cart after removing products : ");
        System.out.println(Arrays.toString(cart_1));
        for(int i=0; i<size; i++) {
            sum += cart_1[i];
        }
        System.out.println("Total Price of all product in your cart : $ "+ sum);
        int high = highest_Price(cart_1, size);
        int low = lowest_Price(cart_1, size);
        System.out.println("Highest price : "+high+"\nLowest price : "+low);
    }
}
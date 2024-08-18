import java.util.Scanner;
public class Car {
    String model;
    int year;
    String color;
    Car(String m, int y, String c) {
        this.model = m;
        this.year = y;
        this.color = c;
    }
    public void carInfo() {
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Colour : "+color);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m1, m2;
        String c1, c2;
        int y1, y2;
        System.out.println("Enter the information for car 1 : ");
        m1 = sc.nextLine();
        c1 = sc.nextLine();
        y1 = sc.nextInt();
        Car C1 = new Car(m1, y1, c1);
        C1.carInfo();
    }
}

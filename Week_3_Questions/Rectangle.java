import java.util.Scanner;

public class Rectangle {
    double length, width;
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public void area() {
        double res = length*width;
        System.out.println("Area : "+res);
    }
    public void perimeter() {
        double res = 2*(length+width);
        System.out.println("Perimeter : "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle : ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle R1 = new Rectangle(l, w);
        R1.area();
        R1.perimeter();
    }
}

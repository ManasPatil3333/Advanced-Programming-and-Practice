// Base class
abstract class Shape {
    abstract double calculateArea();
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test polymorphism
public class Shape_Area {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5);  // Circle object
        Shape myRectangle = new Rectangle(4, 6);  // Rectangle object
        Shape myTriangle = new Triangle(3, 8);  // Triangle object

        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
        System.out.println("Area of Triangle: " + myTriangle.calculateArea());
    }
}
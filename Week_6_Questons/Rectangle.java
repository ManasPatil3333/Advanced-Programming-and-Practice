public class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor to initialize the rectangle with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Displaying initial dimensions and area
        System.out.println("Initial Length: " + rect.getLength());
        System.out.println("Initial Width: " + rect.getWidth());
        System.out.println("Initial Area: " + rect.calculateArea());
        System.out.println("Initial Perimeter: " + rect.calculatePerimeter());

        // Modifying the dimensions
        rect.setLength(7.0);
        rect.setWidth(4.0);

        // Displaying updated dimensions and area
        System.out.println("\nUpdated Length: " + rect.getLength());
        System.out.println("Updated Width: " + rect.getWidth());
        System.out.println("Updated Area: " + rect.calculateArea());
        System.out.println("Updated Perimeter: " + rect.calculatePerimeter());
    }
}

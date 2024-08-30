// Base class
class Calculator {
    // Method to perform addition
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Subclass for Subtraction
class SubtractionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Subclass for Multiplication
class MultiplicationCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Subclass for Division
class DivisionCalculator extends Calculator {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

public class Calculator2 {
    public static void main(String[] args) {
        Calculator addCalc = new Calculator();
        Calculator subCalc = new SubtractionCalculator();
        Calculator mulCalc = new MultiplicationCalculator();
        Calculator divCalc = new DivisionCalculator();

        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition: " + addCalc.calculate(a, b));
        System.out.println("Subtraction: " + subCalc.calculate(a, b));
        System.out.println("Multiplication: " + mulCalc.calculate(a, b));
        System.out.println("Division: " + divCalc.calculate(a, b));
    }
}


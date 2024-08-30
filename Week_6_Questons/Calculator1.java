class Calculator {
    // Method to add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double calculate(double a, double b) {
        return a + b;
    }

    // Method to perform different arithmetic operations based on the operator
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

public class Calculator1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test integer addition
        int sumInt = calculator.calculate(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        // Test double addition
        double sumDouble = calculator.calculate(5.5, 10.3);
        System.out.println("Sum of doubles: " + sumDouble);

        // Test arithmetic operations with different operators
        int resultAddition = calculator.calculate(8, 4, '+');
        System.out.println("8 + 4 = " + resultAddition);

        int resultSubtraction = calculator.calculate(8, 4, '-');
        System.out.println("8 - 4 = " + resultSubtraction);

        int resultMultiplication = calculator.calculate(8, 4, '*');
        System.out.println("8 * 4 = " + resultMultiplication);

        int resultDivision = calculator.calculate(8, 4, '/');
        System.out.println("8 / 4 = " + resultDivision);
    }
}
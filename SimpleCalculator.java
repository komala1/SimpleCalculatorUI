import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple Calculator Application");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            Calculator calculator = new Calculator(num1, num2);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add());
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply());
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calculator.divide());
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
}

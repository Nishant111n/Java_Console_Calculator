import java.util.*;
public class day1 {


    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next().toLowerCase();
            continueCalc = response.equals("yes");
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}



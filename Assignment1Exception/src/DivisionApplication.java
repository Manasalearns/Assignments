
import java.util.Scanner;

public class DivisionApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            // Divide the first number by the second number
            double result = num1 / num2;

            // Print the result
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and print an error message
        	throw new UnsupportedOperationException("Cannot divide by zero.", e);
            
        }
    }
}

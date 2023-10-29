import java.util.function.DoubleBinaryOperator;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a functional interface for calculating simple interest
        DoubleBinaryOperator simpleInterestCalculator = (principal, rate) -> (principal * rate * 1) / 100;

        // Calculate the simple interest for a principal of 1000 and a rate of 5%
        double simpleInterest = simpleInterestCalculator.applyAsDouble(1000, 5);

        // Print the simple interest
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
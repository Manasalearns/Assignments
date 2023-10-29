import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class PurchaseTracker {
    private static final Path file1 = Paths.get("prices.txt");
    private static final Path file2 = Paths.get("total.txt");

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add prices");
            System.out.println("2. View total");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");

            try {
                int option = Integer.parseInt(System.console().readLine());
                switch (option) {
                    case 1:
                        addPrices();
                        break;
                    case 2:
                        viewTotal();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static void addPrices() {
        try {
            System.out.print("Enter the price: ");
            double price = Double.parseDouble(System.console().readLine());

            Files.write(file1, Double.toString(price).getBytes(), StandardOpenOption.APPEND);
            Files.write(file1, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);

            double total = calculateTotal();
            Files.write(file2, Double.toString(total).getBytes(), StandardOpenOption.CREATE);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }

    private static void viewTotal() {
        try {
            List<String> lines = Files.readAllLines(file2);
            if (lines.isEmpty()) {
                System.out.println("No total available.");
            } else {
                System.out.println("Total: " + lines.get(0));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
        }
    }

    private static double calculateTotal() throws IOException {
        List<String> lines = Files.readAllLines(file1);
        double total = lines.stream()
                .mapToDouble(Double::parseDouble)
                .sum();
        return total;
    }
}
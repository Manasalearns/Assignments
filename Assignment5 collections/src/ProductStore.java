
import java.util.HashSet;
import java.util.Scanner;

public class ProductStore {

    public static void main(String[] args) {
        // Create a HashSet to store the products
        HashSet<Product> products = new HashSet<>();

        try (// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in)) {
			// Get the product name from the user
			System.out.println("Enter the product name: ");
			String productName = scanner.nextLine();

			// Create a Product object with the given name
			Product product = new Product(productName);

			// Add the product to the HashSet
			products.add(product);

			// Check if the product was added successfully
			if (products.contains(product)) {
			    System.out.println("Product added successfully.");
			} else {
			    System.out.println("Product already exists.");
			}

			// Repeat the process until the user enters "quit"
			while (!productName.equals("quit")) {
			    // Get the product name from the user
			    System.out.println("Enter the product name: ");
			    productName = scanner.nextLine();

			    // Create a Product object with the given name
			    product = new Product(productName);

			    // Add the product to the HashSet
			    products.add(product);

			    // Check if the product was added successfully
			    if (products.contains(product)) {
			        System.out.println("Product added successfully.");
			    } else {
			        System.out.println("Product already exists.");
			    }
			}
		}

        // Print the products in the HashSet
        System.out.println("Products:");
        for (Product product1 : products) {
            System.out.println(product1.getName());
        }
    }
}

class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product otherProduct = (Product) obj;
            return this.name.equals(otherProduct.name);
        }
        return false;
    }

   
    public int hashCode() {
        return name.hashCode();
    }
}
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {

        // Create a HashSet to hold Employee objects
        HashSet<Employee> employees = new HashSet<>();

        // Add some Employee objects to the set
        employees.add(new Employee(1, "John Doe", 10000.0, "Sales"));
        employees.add(new Employee(2, "Jane Doe", 12000.0, "Marketing"));
        employees.add(new Employee(3, "Bob Smith", 15000.0, "Engineering"));

        // Display the details of the employees added to the set
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }

}

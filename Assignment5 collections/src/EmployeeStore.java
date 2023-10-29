import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeStore {

    public static void main(String[] args) {
        // Create a TreeSet to store the employees
        TreeSet<Employee> employees = new TreeSet<>();

        // Add some employees to the TreeSet
        employees.add(new Employee(1, "John Doe", "Sales", 50000));
        employees.add(new Employee(2, "Jane Doe", "Marketing", 60000));
        employees.add(new Employee(3, "Bob Smith", "Engineering", 70000));
        employees.add(new Employee(4, "Alice Smith", "Finance", 80000));
        employees.add(new Employee(5, "Tom Jones", "IT", 90000));
        employees.add(new Employee(6, "Susan Jones", "HR", 100000));
        employees.add(new Employee(7, "David Brown", "Sales", 110000));
        employees.add(new Employee(8, "Mary Brown", "Marketing", 120000));
        employees.add(new Employee(9, "Peter White", "Engineering", 130000));
        employees.add(new Employee(10, "Linda White", "Finance", 140000));

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice
        System.out.println("Run Application:");
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        // Print the employee details sorted by the user's choice
        switch (choice) {
            case "a":
                System.out.println("Employees sorted by ID:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case "b":
                System.out.println("Employees sorted by name:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case "c":
                System.out.println("Employees sorted by department:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case "d":
                System.out.println("Employees sorted by salary:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
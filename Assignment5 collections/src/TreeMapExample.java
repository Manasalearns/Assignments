import java.util.*;

class Contact {
    String name;
    String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Long, Contact> contacts = new TreeMap<>();
        contacts.put(1234567890L, new Contact("Alice", "alice@example.com"));
        contacts.put(2345678901L, new Contact("Bob", "bob@example.com"));
        contacts.put(3456789012L, new Contact("Charlie", "charlie@example.com"));

        // a. Fetch all the keys and print them
        System.out.println("Keys:");
        Set<Long> keys = contacts.keySet();
        for (Long key : keys) {
            System.out.println(key);
        }

        // b. Fetch all the values and print them
        System.out.println("\nValues:");
        Collection<Contact> values = contacts.values();
        for (Contact value : values) {
            System.out.println(value);
        }

        // c. Print all key-value pairs
        System.out.println("\nKey-Value Pairs:");
        Set<Map.Entry<Long, Contact>> entries = contacts.entrySet();
        for (Map.Entry<Long, Contact> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
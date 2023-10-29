
import java.util.HashMap;
import java.util.Random;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store 10 random int values as keys and 10 random double values as values
        HashMap<Integer, Double> hashMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt();
            double value = random.nextDouble();
            hashMap.put(key, value);
        }

        // Print the data stored in the HashMap
        System.out.println(hashMap);
    }
}
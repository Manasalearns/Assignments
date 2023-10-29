import java.util.Date;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, Date> myObj = new Pair<>("Today is", new Date());
        System.out.println(myObj.getKey()); // Output: Today is
        System.out.println(myObj.getValue()); // Output: 2023-03-08T12:00:00.000Z
    }
}
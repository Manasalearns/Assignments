public class Pair1<K, V> {

    private K key;
    private V value;

    public Pair1(K key, V value) {
        if (key == null || !(key instanceof String)) {
            throw new IllegalArgumentException("Key must be a String");
        }
        if (value == null || !(value instanceof String)) {
            throw new IllegalArgumentException("Value must be a String");
        }
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        if (key == null || !(key instanceof String)) {
            throw new IllegalArgumentException("Key must be a String");
        }
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        if (value == null || !(value instanceof String)) {
            throw new IllegalArgumentException("Value must be a String");
        }
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, String> myObj = new Pair<>("5", "Hello");
        System.out.println(myObj.getKey()); // Output: 5
        System.out.println(myObj.getValue()); // Output: Hello
    }
}
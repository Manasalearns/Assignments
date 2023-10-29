import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        int x = 2, y = 4;
        System.out.println("Exchanging elements at positions " + x + " and " + y);
        exchangeElements(arr, x, y);

        System.out.println("Modified array: " + Arrays.toString(arr));
    }

    public static <T> void exchangeElements(T[] arr, int x, int y) {
        if (x >= arr.length || y >= arr.length || x < 0 || y < 0) {
            throw new IllegalArgumentException("Invalid positions");
        }

        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

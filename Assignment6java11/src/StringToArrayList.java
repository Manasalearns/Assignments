
import java.util.ArrayList;
import java.util.Arrays;

public class StringToArrayList {

    public static void main(String[] args) {
        // Create a string
        String str = "A quick brown fox jumps over the lazy dog";

        // Create an ArrayList from the string
        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));

        // Convert the ArrayList to an array
        String[] wordsArray = words.toArray(new String[words.size()]);

        // Print the output
        System.out.println(Arrays.toString(wordsArray));
    }
}
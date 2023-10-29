
public class ReverseStringBuilder {
	public static void main(String[] args) {
        // Create a string
        String str = "This method returns the reversed object on which it was called";

        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer(str);

        // Reverse the string using the reverse() method
        sb.reverse();

        // Print the reversed string
        System.out.println(sb);
    }


}

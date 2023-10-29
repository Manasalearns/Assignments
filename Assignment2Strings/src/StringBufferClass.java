public class StringBufferClass {
	public static void main(String[] args) {
		String str1 = "It is used to _ at the specified index position";
		String str2 = "insert text";

		// Find the index of the character '_' in str1
		int index = str1.indexOf("_");

		// Insert str2 into str1 at the index of '_'
		String newStr = str1.substring(0, index) + str2 + str1.substring(index + 1);

		// Print the new string
		System.out.println(newStr);
		
	}

}
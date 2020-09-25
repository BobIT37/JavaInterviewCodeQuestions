package Java_07_Strings;

public class Str_06_JoiningString {

	public static void main(String[] args) {
		
		// An array of strings can be joined using the static method String.join():
		
		String[] elements = { "foo", "bar", "foobar" }; 
		
		//Separate print
		for (String element: elements) {
            System.out.println(element);
        }
		
		//Join method
		String singleString = String.join("  ", elements);
		
		System.out.println(singleString); // Prints "foo + bar + foobar"

	}

}
